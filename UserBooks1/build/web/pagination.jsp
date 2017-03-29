<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="util.BookUtil" %>
<%@page import="dao.BookDao" %>
<%@page import="model.BookModel" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagination</title>
        <script type="text/javascript" src="jquery.min.js"></script>
        <script>
            var last=0;
            var prev=0;
            var next=0;
            $(document).ready(function(){
                $(".all").hide();
                $("#prev").hide();
                $(".1").show();                
                last=Number($("#last").val());
            });
            function myFun(y){
                var x=0;
                x=Number(y);
                $("#prev").show();
                $("#next").show();
                $("#prev").data("ans",x-1);
                $("#next").data("ans",x+1);
                if(x===1)
                {
                    $("#prev").hide();
                }
                else if(x===last)
                {
                   $("#next").hide();       
                }
                $(".all").hide();
                $("."+x).show();
            }
            function myFun2(y)
            {
                var prev=$("#prev").data("ans");
                var next=$("#next").data("ans");
                if(y==='p')
                    {
                        myFun(prev);
                    }
                else if(y==='n')
                    {
                        myFun(next);
                    }
            }
        </script>
    </head>
    <body>
        <%
            BookUtil book=new BookDao();
            List<BookModel> list=new ArrayList<BookModel>();
            list=book.getAll();
            int i,j,k,x,a,n;
            k=list.size();
            x=k/3;
            if(k%3!=0)
            {
             x++;
            } %>
            <input type="hidden" value="<%=x%>" id="last"/>
            <%   for(i=1;i<=x;i++)
            {
             %>
             <input type="button" value="<%=i%>" name="page" onclick='myFun("<%=i%>");'/>
           <% 
            }
                n=0;
                for(i=0;i<x;i++)
                {
                    %>
                    <div class="<%=i+1%> all">
                        <%
                           a=(2+n*3);
                           if(a>k-1)
                           {
                               a=k-1;
                           }
                           for(j=(n*3);j<=a;j++)
                           {
                             BookModel model=new BookModel();
                             model=list.get(j); 
                        %>
                        <p> <h2>   <%=model.getBname()%> </h2> </p>
                        <%
                           }
                           n++; 
                        %>                        
                    </div>                
               <% 
                }
              %> 
              <input type="button" value="Prev" data-ans="1" id="prev" onclick="myFun2('p');"/>
              <input type="button" value="Next" data-ans="2" id="next" onclick="myFun2('n');"/>
    </body>
</html>
