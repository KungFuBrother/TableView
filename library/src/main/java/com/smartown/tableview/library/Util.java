package com.smartown.tableview.library;

import android.content.Context;

/**
 * Author:Tiger
 * <p>
 * CrateTime:2017-02-04 14:18
 * <p>
 * Description:使用到的工具类
 */
public class Util {

    public static int dip2px(Context context, float dipValue) {
        return (int) (dipValue * context.getResources().getDisplayMetrics().density);
    }

}
