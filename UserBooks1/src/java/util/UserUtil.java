
package util;

import model.UserModel;

public interface UserUtil {
    public boolean registerUser(UserModel model);
    public boolean authenticateUser(UserModel model);
    public boolean changePassword(UserModel model,String newPwd);
}
