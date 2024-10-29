package Managers;

import models.Group;
import models.User;

import java.util.ArrayList;
import java.util.List;


public class GroupManager {

    List<Group> groups;

    public GroupManager() {
        this.groups = new ArrayList<>();
    }


    public Group createGroup(String groupName, List<User> users) {
        Group group = new Group(groupName, users);
        this.groups.add(group);
        return group;
    }

}
