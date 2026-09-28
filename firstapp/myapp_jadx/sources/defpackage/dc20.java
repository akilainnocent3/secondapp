package defpackage;

import android.content.Intent;
import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dc20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dc20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj;
                int i2 = PreMatchEventActivity.a2;
                Object tag = view.getTag();
                if (tag != null) {
                    Intent intent = new Intent(preMatchEventActivity, (Class<?>) ZoomImageActivity.class);
                    intent.putExtra("param_image_uri", tag instanceof String ? (String) tag : null);
                    preMatchEventActivity.startActivity(intent);
                }
                break;
            default:
                km60 km60Var = (km60) obj;
                km60.b(km60Var.f, AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                km60Var.dismiss();
                break;
        }
    }
}
