package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.LiveStreamDataSportyTV;
import com.sportybet.plugin.realsports.widget.EPLStreamingMentionView;

/* JADX INFO: loaded from: classes4.dex */
public final class dns implements EPLStreamingMentionView.a {
    public final /* synthetic */ LiveStreamDataSportyTV a;
    public final /* synthetic */ hns b;
    public final /* synthetic */ String c;
    public final /* synthetic */ EPLStreamingMentionView d;
    public final /* synthetic */ boolean e;

    public dns(LiveStreamDataSportyTV liveStreamDataSportyTV, hns hnsVar, String str, EPLStreamingMentionView ePLStreamingMentionView, boolean z) {
        this.a = liveStreamDataSportyTV;
        this.b = hnsVar;
        this.c = str;
        this.d = ePLStreamingMentionView;
        this.e = z;
    }

    @Override // com.sportybet.plugin.realsports.widget.EPLStreamingMentionView.a
    public final void a() {
        EPLStreamingMentionView ePLStreamingMentionView = this.d;
        LiveStreamDataSportyTV liveStreamDataSportyTV = this.a;
        boolean playInDotCom = liveStreamDataSportyTV.getPlayInDotCom();
        hns hnsVar = this.b;
        if (!playInDotCom) {
            ems emsVar = hnsVar.b;
            ems emsVar2 = hnsVar.b;
            if (emsVar.e.getVisibility() == 0) {
                emsVar2.f.setVisibility(8);
                emsVar2.e.setVisibility(8);
            }
            hnsVar.h.invoke(liveStreamDataSportyTV.getUrl(), liveStreamDataSportyTV, Boolean.valueOf(this.e));
            return;
        }
        try {
            ePLStreamingMentionView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(hnsVar.d.b("matches", "matchDetail", this.c))));
            f00 f00Var = vgb0.a;
            vgb0.a("play_in_dot_com__launch_success");
        } catch (Exception unused) {
            Toast.makeText(ePLStreamingMentionView.getContext(), R.string.live__launch_sporty_dot_com_failed, 0).show();
            f00 f00Var2 = vgb0.a;
            vgb0.a("play_in_dot_com__launch_failed");
        }
    }
}
