package cn.ljuns.logcollector;

import android.support.annotation.StringDef;

/**
 * Created by ljuns on 2018/8/17
 * I am just a developer.
 */
public class ColorUtils {

    public static final String VERBOSE_COLOR = "#ED008C";
    public static final String DEBUG_COLOR = "#00FFOO";
    public static final String INFO_COLOR = "#00FFFF";
    public static final String WARN_COLOR = "#FFFFOO";
    public static final String ERROR_COLOR = "#FF00OO";
    public static final String ASSERT_COLOR = "#00AEEF";
    public static final String WHITE_COLOR = "#FFFFFF";
    public static final String BLACK_COLOR = "#000000";

    public static final String[] COLORS = new String[]{VERBOSE_COLOR,
            DEBUG_COLOR, INFO_COLOR, WARN_COLOR, ERROR_COLOR, ASSERT_COLOR};

    @StringDef({WHITE_COLOR, BLACK_COLOR})
    @interface BgColor {}

}
