package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j6g extends Dialog {
    public vo40 a;
    public k6g b;

    public final vo40 a() {
        vo40 vo40Var = this.a;
        if (vo40Var != null) {
            return vo40Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.redblack_end_round_stats_dialog, (ViewGroup) null, false);
        int i = R.id.rb_endround_close;
        FloatingActionButton floatingActionButton = (FloatingActionButton) h5e.a(R.id.rb_endround_close, viewInflate);
        if (floatingActionButton != null) {
            i = R.id.rb_endround_stats_list;
            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.rb_endround_stats_list, viewInflate);
            if (recyclerView != null) {
                i = R.id.rb_endround_status_layer;
                if (((RelativeLayout) h5e.a(R.id.rb_endround_status_layer, viewInflate)) != null) {
                    i = R.id.title;
                    TextView textView = (TextView) h5e.a(R.id.title, viewInflate);
                    if (textView != null) {
                        this.a = new vo40((ConstraintLayout) viewInflate, floatingActionButton, recyclerView, textView);
                        setContentView(a().a);
                        a().b.setOnClickListener(new View.OnClickListener() { // from class: i6g
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                zj60 bridge;
                                String str = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
                                Bundle bundleA = whs.a("popup_name", "end round state", "button_name", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                                bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, "Red-Black");
                                bundleA.putString("user_state", str);
                                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                                if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                                    ((bk60) bridge).a("popup_action", bundleA);
                                }
                                this.a.dismiss();
                            }
                        });
                        op5.r(op5.a, b.f(a().d), null, 4);
                        return;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
