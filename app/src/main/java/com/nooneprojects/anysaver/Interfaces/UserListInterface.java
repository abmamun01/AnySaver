package com.nooneprojects.anysaver.Interfaces;


import com.nooneprojects.anysaver.Fragments.FBStoryModel.NodeModel;
import com.nooneprojects.anysaver.Fragments.story.TrayModel;

public interface UserListInterface {
    void userListClick(int position, TrayModel trayModel);
    void fbUserListClick(int position, NodeModel trayModel);
}
