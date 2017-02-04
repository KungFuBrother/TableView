package com.smartown.tableview.demo;

import android.app.Activity;
import android.os.Bundle;

import com.smartown.tableview.library.TableView;

/**
 * Author:<a href='https://github.com/kungfubrother'>https://github.com/kungfubrother</a>
 * <p>
 * CrateTime:2017-2-4 16:02:39
 * <p>
 * Description:demo
 */
public class MainActivity extends Activity {

    private TableView tableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableView = (TableView) findViewById(R.id.table);
        tableView.clearTableContents()
                .setHeader("区域", "人数", "占比")
                .addContent("北京", "50", "50%")
                .addContent("上海", "30", "30%")
                .addContent("广东", "20", "20%")
                .addContent("深圳", "10", "10%")
                .refreshTable();
    }
}
