package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.prematch.data.LiveTournamentData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a3p extends e64<jid0> implements wyg {
    public final LiveTournamentData d;
    public final Function1<String, Unit> e;
    public vyg f;

    /* JADX WARN: Multi-variable type inference failed */
    public a3p(LiveTournamentData liveTournamentData, Function1<? super String, Unit> function1) {
        this.d = liveTournamentData;
        this.e = function1;
    }

    @Override // defpackage.wyg
    public final void b(vyg vygVar) {
        this.f = vygVar;
    }

    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) {
        jid0 jid0Var = (jid0) g6i0Var;
        jid0Var.getClass();
        final AppCompatCheckBox appCompatCheckBox = jid0Var.c;
        LiveTournamentData liveTournamentData = this.d;
        appCompatCheckBox.setTag(liveTournamentData);
        appCompatCheckBox.setText(liveTournamentData.getTournament().categoryName + " - " + liveTournamentData.getTournament().name);
        Context context = appCompatCheckBox.getContext();
        context.getClass();
        Drawable drawable = context.getDrawable(liveTournamentData.isExpanded() ? R.drawable.spr_ic_arrow_drop_down_black_24dp : R.drawable.spr_ic_arrow_right_black_24dp);
        if (drawable != null) {
            aef.b(drawable, context, R.color.brand_secondary_variable_type3);
        } else {
            drawable = null;
        }
        appCompatCheckBox.setButtonDrawable(drawable);
        appCompatCheckBox.setOnClickListener(new View.OnClickListener() { // from class: z2p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = view.getTag();
                if (!(tag instanceof LiveTournamentData)) {
                    tag = null;
                }
                LiveTournamentData liveTournamentData2 = (LiveTournamentData) tag;
                if (liveTournamentData2 == null) {
                    return;
                }
                a3p a3pVar = this.a;
                vyg vygVar = a3pVar.f;
                if (vygVar == null) {
                    Intrinsics.n("expandableGroup");
                    throw null;
                }
                vygVar.o();
                Context context2 = view.getContext();
                context2.getClass();
                vyg vygVar2 = a3pVar.f;
                if (vygVar2 == null) {
                    Intrinsics.n("expandableGroup");
                    throw null;
                }
                Drawable drawable2 = context2.getDrawable(vygVar2.b ? R.drawable.spr_ic_arrow_drop_down_black_24dp : R.drawable.spr_ic_arrow_right_black_24dp);
                if (drawable2 != null) {
                    aef.b(drawable2, context2, R.color.brand_secondary_variable_type3);
                } else {
                    drawable2 = null;
                }
                appCompatCheckBox.setButtonDrawable(drawable2);
                vyg vygVar3 = a3pVar.f;
                if (vygVar3 == null) {
                    Intrinsics.n("expandableGroup");
                    throw null;
                }
                liveTournamentData2.setExpanded(vygVar3.b);
                if (liveTournamentData2.isExpanded()) {
                    Function1<String, Unit> function1 = a3pVar.e;
                    String str = liveTournamentData2.getTournament().id;
                    str.getClass();
                    function1.invoke(str);
                }
            }
        });
        jid0Var.b.setVisibility(8);
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spr_live_section_header;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        return jid0.a(view);
    }
}
