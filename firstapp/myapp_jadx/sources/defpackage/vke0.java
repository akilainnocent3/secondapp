package defpackage;

import android.widget.TextView;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import com.sportybet.plugin.swipebet.activities.SwipeBetSettingActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class vke0 implements voy {
    public final /* synthetic */ SwipeBetSettingActivity a;

    public vke0(SwipeBetSettingActivity swipeBetSettingActivity) {
        this.a = swipeBetSettingActivity;
    }

    @Override // defpackage.voy
    public final void a(RangeSeekBar rangeSeekBar, float f, float f2) {
        SwipeBetSettingActivity swipeBetSettingActivity = this.a;
        swipeBetSettingActivity.c = f;
        swipeBetSettingActivity.d = f2;
        TextView textView = swipeBetSettingActivity.b;
        StringBuilder sb = new StringBuilder();
        String[] strArr = SwipeBetSettingActivity.D;
        sb.append(gky.a(strArr[SwipeBetSettingActivity.z1(swipeBetSettingActivity.c)]));
        sb.append(" - ");
        sb.append(gky.a(strArr[SwipeBetSettingActivity.z1(swipeBetSettingActivity.d)]));
        textView.setText(sb.toString());
    }

    @Override // defpackage.voy
    public final void b(RangeSeekBar rangeSeekBar) {
    }
}
