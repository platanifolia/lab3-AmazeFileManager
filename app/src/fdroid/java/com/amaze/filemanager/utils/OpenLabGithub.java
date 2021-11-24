package com.amaze.filemanager.utils;

import com.amaze.filemanager.ui.activities.superclasses.BasicActivity;

public class OpenLabGithub {

    private static final String URL_lab_github = "https://github.com/platanifolia/lab3-AmazeFileManager";

    public OpenLabGithub(BasicActivity activity) {
        Utils.openURL(URL_lab_github, activity);
    }

    public void destroyOpenLabGithubInstance() {
        // do nothing
    }
}
