package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class yd20 {

    public static final /* synthetic */ class a extends saj implements gaj<LayoutInflater, ViewGroup, Boolean, sjd0> {
        public static final a a = new a(3, sjd0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sportybet/android/databinding/SprSportEventItemWithFilterBinding;", 0);

        @Override // defpackage.gaj
        public final sjd0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            boolean zBooleanValue = bool.booleanValue();
            layoutInflater2.getClass();
            return sjd0.a(layoutInflater2, viewGroup, zBooleanValue);
        }
    }

    public static final void a(final Event event, final Market market, final List<? extends Outcome> list, final Function1<? super Event, Unit> function1, final Function1<? super Event, Unit> function2, final jaj<? super Event, ? super Market, ? super Outcome, ? super Boolean, ? super Boolean, Boolean> jajVar, final gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar2;
        boolean z2;
        final boolean z3;
        String strA;
        final boolean z4;
        event.getClass();
        list.getClass();
        function1.getClass();
        function2.getClass();
        jajVar.getClass();
        gajVar.getClass();
        b bVarI = aVar.i(-1092281987);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(event) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(market) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? bVarI.M(list) : bVarI.A(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.A(jajVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            gajVar2 = gajVar;
            i3 |= bVarI.A(gajVar2) ? 1048576 : 524288;
        } else {
            gajVar2 = gajVar;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 12582912) == 0) {
                i3 |= bVarI.b(z2) ? 8388608 : 4194304;
            }
        }
        if (bVarI.q(i3 & 1, (i3 & 4793491) != 4793490)) {
            if (i4 != 0) {
                z2 = false;
            }
            final String strA2 = cb40.a(R.string.app_common__market_count, new Object[]{Integer.valueOf(event.totalMarketSize)}, bVarI);
            Sport sport = event.sport;
            Category category = sport != null ? sport.category : null;
            Tournament tournament = category != null ? category.tournament : null;
            if (category == null || tournament == null) {
                bVarI.N(-1499725359);
                bVarI.X(false);
                strA = null;
            } else {
                bVarI.N(-1499826109);
                strA = cb40.a(R.string.app_common__var_to_var, new Object[]{category.name, tournament.name}, bVarI);
                bVarI.X(false);
            }
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = a.a;
                bVarI.r(objY);
            }
            gaj gajVar3 = (gaj) ((chp) objY);
            boolean z5 = z2;
            d dVarI = j.i(j.g(d.a.b, 1.0f), 84.0f);
            boolean zA = ((3670016 & i3) == 1048576) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && bVarI.A(list))) | bVarI.A(market) | bVarI.A(event) | ((458752 & i3) == 131072) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | bVarI.M(strA) | ((i3 & 29360128) == 8388608) | bVarI.M(strA2);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                z4 = z5;
                final gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar4 = gajVar2;
                final String str = strA;
                Function1 function3 = new Function1() { // from class: td20
                    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.View, android.widget.CompoundButton, com.sportybet.plugin.realsports.widget.OutcomeButton] */
                    /* JADX WARN: Type inference failed for: r15v1 */
                    /* JADX WARN: Type inference failed for: r15v12 */
                    /* JADX WARN: Type inference failed for: r15v2 */
                    /* JADX WARN: Type inference failed for: r9v18 */
                    /* JADX WARN: Type inference failed for: r9v2 */
                    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i5;
                        int i6;
                        int i7;
                        ?? r15;
                        sjd0 sjd0Var = (sjd0) obj;
                        sjd0Var.getClass();
                        FrameLayout frameLayout = sjd0Var.a;
                        ImageView imageView = sjd0Var.B;
                        ImageView imageView2 = sjd0Var.N;
                        TextView textView = sjd0Var.c;
                        AppCompatImageView appCompatImageView = sjd0Var.L;
                        frameLayout.setBackgroundColor(frameLayout.getContext().getColor(R.color.bg_secondary_d_lightest));
                        List<OutcomeButton> listK = kotlin.collections.b.k(sjd0Var.w, sjd0Var.y, sjd0Var.z, sjd0Var.A);
                        for (OutcomeButton outcomeButton : listK) {
                            outcomeButton.getClass();
                            outcomeButton.setVisibility(8);
                        }
                        Iterator it = list.iterator();
                        ?? r9 = 0;
                        int i8 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            final Event event2 = event;
                            if (!zHasNext) {
                                LinearLayout linearLayout = sjd0Var.i;
                                final Function1 function4 = function1;
                                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: wd20
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        function4.invoke(event2);
                                    }
                                });
                                sjd0Var.e.setText(event2.homeTeamName);
                                sjd0Var.b.setText(event2.awayTeamName);
                                sjd0Var.M.setText(bwf0.a.d(event2.estimateStartTime, false));
                                sjd0Var.f.setText(b3.P(event2));
                                c8i0.o(appCompatImageView, event2.showStats());
                                final Function1 function5 = function2;
                                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: xd20
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        function5.invoke(event2);
                                    }
                                });
                                textView.setText(str);
                                c8i0.o(textView, z4);
                                sjd0Var.v.setText(strA2);
                                c8i0.o(sjd0Var.K, event2.hasLiveStream());
                                c8i0.o(sjd0Var.I, event2.hasAudioStream());
                                c8i0.o(sjd0Var.J, event2.hasGift());
                                sjd0Var.D.setVisibility(8);
                                if (event2.topTeam) {
                                    Context context = frameLayout.getContext();
                                    context.getClass();
                                    int iA = fug0.a(hug0.a, context);
                                    if (iA == 0) {
                                        i7 = R.drawable.spr_sports_hot;
                                    } else if (iA == 1) {
                                        i7 = R.drawable.spr_sports_hot_sw;
                                    } else if (iA == 2 || iA == 3 || iA == 4) {
                                        i7 = R.drawable.spr_sports_hot_es_mx;
                                    } else {
                                        if (iA != 5) {
                                            uhc.a();
                                            return null;
                                        }
                                        i7 = R.drawable.spr_sports_hot_fr_fr;
                                    }
                                    imageView2.setImageDrawable(gr0.a(context, i7));
                                    imageView2.setVisibility(0);
                                } else {
                                    imageView2.setVisibility(8);
                                }
                                if (event2.oddsBoost) {
                                    Context context2 = frameLayout.getContext();
                                    context2.getClass();
                                    int iA2 = fug0.a(hug0.a, context2);
                                    if (iA2 == 0) {
                                        i6 = R.drawable.spr_odds_boost;
                                    } else if (iA2 == 1) {
                                        i6 = R.drawable.spr_odds_boost_sw;
                                    } else if (iA2 == 2) {
                                        i6 = R.drawable.spr_odds_boost_es_mx;
                                    } else if (iA2 == 3) {
                                        i6 = R.drawable.spr_odds_boost_pt_br;
                                    } else if (iA2 == 4) {
                                        i6 = R.drawable.spr_odds_boost_pt_mz;
                                    } else {
                                        if (iA2 != 5) {
                                            uhc.a();
                                            return null;
                                        }
                                        i6 = R.drawable.spr_odds_boost_fr_fr;
                                    }
                                    imageView.setImageDrawable(gr0.a(context2, i6));
                                    imageView.setVisibility(0);
                                    i5 = 8;
                                } else {
                                    i5 = 8;
                                    imageView.setVisibility(8);
                                }
                                sjd0Var.F.setVisibility(i5);
                                return Unit.a;
                            }
                            Object next = it.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            final Outcome outcome = (Outcome) next;
                            Object obj2 = listK.get(i8);
                            obj2.getClass();
                            final ?? r11 = (OutcomeButton) obj2;
                            final Market market2 = market;
                            if (market2.status == 0 && outcome.isActive == 1) {
                                String str2 = outcome.odds;
                                str2.getClass();
                                if (str2.length() > 0) {
                                    r15 = 1;
                                } else {
                                    r15 = r9;
                                }
                            } else {
                                r15 = r9;
                            }
                            r11.setVisibility(r9);
                            if (r15 != 0) {
                                r11.setTag(new Selection(event2, market2, outcome));
                                r11.setEnabled(true);
                                String str3 = outcome.odds;
                                str3.getClass();
                                r11.setOdds(str3);
                                int i10 = outcome.flag;
                                if (i10 == 1) {
                                    r11.g();
                                    outcome.flag = r9;
                                } else if (i10 == 2) {
                                    r11.c();
                                    outcome.flag = r9;
                                }
                            } else {
                                r11.setImage(R.drawable.spr_ic_prematch_lock, r9);
                                r11.setEnabled(r9);
                            }
                            r11.b();
                            final f8z f8zVar = (f8z) gajVar4.invoke(event2, market2, outcome);
                            r11.setChecked(f8zVar.a);
                            BigDecimal bigDecimal = f8zVar.b;
                            if (bigDecimal != null) {
                                String str4 = outcome.odds;
                                str4.getClass();
                                kuh.e(r11, bigDecimal, str4, frameLayout, ku1.b, false);
                            }
                            final jaj jajVar2 = jajVar;
                            r11.setOnClickListener(new View.OnClickListener() { // from class: vd20
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    boolean z6 = f8zVar.b != null;
                                    OutcomeButton outcomeButton2 = r11;
                                    if (((Boolean) jajVar2.l(event2, market2, outcome, Boolean.valueOf(outcomeButton2.isChecked()), Boolean.valueOf(z6))).booleanValue()) {
                                        return;
                                    }
                                    outcomeButton2.setChecked(!outcomeButton2.isChecked());
                                }
                            });
                            i8 = i9;
                            r9 = 0;
                        }
                    }
                };
                bVarI.r(function3);
                objY2 = function3;
            } else {
                z4 = z5;
            }
            id0.a(gajVar3, dVarI, (Function1) objY2, bVarI, 54);
            z3 = z4;
        } else {
            bVarI.G();
            z3 = z2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ud20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yd20.a(event, market, list, function1, function2, jajVar, gajVar, z3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
