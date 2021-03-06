package com.example.dllo.homemycar.entity; /*
        quu..__
         $$$b  `---.__
          "$$b        `--.                          ___.---uuudP
           `$$b           `.__.------.__     __.---'      $$$$"              .
             "$b          -'            `-.-'            $$$"              .'|
               ".                                       d$"             _.'  |
                 `.   /                              ..."             .'     |
                   `./                           ..::-'            _.'       |
                    /                         .:::-'            .-'         .'
                   :                          ::''\          _.'            |
                  .' .-.             .-.           `.      .'               |
                  : /'$$|           .@"$\           `.   .'              _.-'
                 .'|$u$$|          |$$,$$|           |  <            _.-'
                 | `:$$:'          :$$$$$:           `.  `.       .-'
                 :                  `"--'             |    `-.     \
                :                |                |#'     `..'`..'          `                 \                                   xXX|     /    ./
                  \                                xXXX'|    /   ./
                  /`-.                                  `.  /   /
                 :    `-  ...........,                   | /  .'
                 |         ``:::::::'       .            |<    `.
                 |             ```          |           x| \ `.:``.
                 |                         .'    /'   xXX|  `:`M`M':.
                 |    |                    ;    /:' xXXX'|  -'MMMMM:'
                 `.  .'                   :    /:'       |-'MMMM.-'
                  |  |                   .'   /'        .'MMM.-'
                  `'`'                   :  ,'          |MMM<
                    |                     `'            |tbap\
                     \                                  :MM.-'
                      \                 |              .''
                       \.               `.            /
                        /     .:::::::.. :           /
                       |     .:::::::::::`.         /
                       |   .:::------------\       /
                      /   .''               >::'  /
                      `',:                 :    .'
                                           `:.:'

         
        */

import android.support.v4.app.Fragment;

import com.example.dllo.homemycar.historyfragment.ForumFragment;
import com.example.dllo.homemycar.historyfragment.PasteFragment;
import com.example.dllo.homemycar.historyfragment.SpeakFragment;
import com.example.dllo.homemycar.historyfragment.VideoFragment;
import com.example.dllo.homemycar.mycolect.CarModelFragment;
import com.example.dllo.homemycar.mycolect.CarReputationFragment;
import com.example.dllo.homemycar.mycolect.CarUpFragment;
import com.example.dllo.homemycar.mycolect.TitleFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/26.
 */
public class HistoryTabInfo {
    private String title;
    private Fragment fragment;

    public HistoryTabInfo(String title, Fragment fragment) {
        this.title = title;
        this.fragment = fragment;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public static List<HistoryTabInfo> getHistoryTabInfo() {
        List<HistoryTabInfo> tabInfos = new ArrayList<>();
        tabInfos.add(new HistoryTabInfo("??????", new CarUpFragment()));
        tabInfos.add(new HistoryTabInfo("??????", new CarModelFragment()));
        tabInfos.add(new HistoryTabInfo("??????", new CarReputationFragment()));
        tabInfos.add(new HistoryTabInfo("??????", new TitleFragment()));
        tabInfos.add(new HistoryTabInfo("??????", new VideoFragment()));
        tabInfos.add(new HistoryTabInfo("??????", new SpeakFragment()));
        tabInfos.add(new HistoryTabInfo("??????", new ForumFragment()));
        tabInfos.add(new HistoryTabInfo("??????", new PasteFragment()));
        return tabInfos;
    }
}
