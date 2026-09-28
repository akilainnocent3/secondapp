package defpackage;

import android.content.Context;
import android.graphics.Typeface;
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
import androidx.gridlayout.widget.GridLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class als {

    public static final /* synthetic */ class a extends saj implements gaj<LayoutInflater, ViewGroup, Boolean, iid0> {
        public static final a a = new a(3, iid0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sportybet/android/databinding/SprLivePreMatchItemBinding;", 0);

        @Override // defpackage.gaj
        public final iid0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            boolean zBooleanValue = bool.booleanValue();
            layoutInflater2.getClass();
            return iid0.a(layoutInflater2, viewGroup, zBooleanValue);
        }
    }

    public static final void a(final mfb0 mfb0Var, final Event event, final Market market, final List<? extends Outcome> list, final Function1<? super Event, Unit> function1, final Function1<? super Event, Unit> function2, final jaj<? super Event, ? super Market, ? super Outcome, ? super Boolean, ? super Boolean, Boolean> jajVar, final gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar2;
        final boolean z2;
        final String str;
        final boolean z3;
        mfb0Var.getClass();
        event.getClass();
        list.getClass();
        function1.getClass();
        function2.getClass();
        jajVar.getClass();
        gajVar.getClass();
        b bVarI = aVar.i(-492415039);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(mfb0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(event) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(market) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? bVarI.M(list) : bVarI.A(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.A(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.A(jajVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            gajVar2 = gajVar;
            i3 |= bVarI.A(gajVar2) ? 8388608 : 4194304;
        } else {
            gajVar2 = gajVar;
        }
        int i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= 100663296;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 100663296) == 0) {
                i3 |= bVarI.b(z2) ? 67108864 : 33554432;
            }
        }
        if (bVarI.q(i3 & 1, (i3 & 38347923) != 38347922)) {
            if (i4 != 0) {
                z2 = false;
            }
            final String strA = cb40.a(R.string.app_common__market_count, new Object[]{Integer.valueOf(event.totalMarketSize)}, bVarI);
            Sport sport = event.sport;
            Category category = sport != null ? sport.category : null;
            Tournament tournament = category != null ? category.tournament : null;
            if (!z2 || category == null || tournament == null) {
                bVarI.N(2072614797);
                bVarI.X(false);
                str = null;
            } else {
                bVarI.N(2072514047);
                String strA2 = cb40.a(R.string.app_common__var_to_var, new Object[]{category.name, tournament.name}, bVarI);
                bVarI.X(false);
                str = strA2;
            }
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = a.a;
                bVarI.r(objY);
            }
            gaj gajVar3 = (gaj) ((chp) objY);
            boolean z4 = z2;
            d dVarI = j.i(j.g(d.a.b, 1.0f), 84.0f);
            int i5 = i3;
            boolean zA = ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && bVarI.A(list))) | bVarI.A(market) | bVarI.A(event) | ((i5 & 3670016) == 1048576) | ((i5 & 57344) == 16384) | ((i5 & 458752) == 131072) | bVarI.M(str) | ((i5 & 234881024) == 67108864) | bVarI.M(strA) | bVarI.A(mfb0Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                final gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar4 = gajVar2;
                z3 = z4;
                Function1 function3 = new Function1() { // from class: vks
                    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6;
                        int i7;
                        int i8;
                        int i9;
                        boolean z5;
                        iid0 iid0Var = (iid0) obj;
                        iid0Var.getClass();
                        FrameLayout frameLayout = iid0Var.a;
                        ImageView imageView = iid0Var.B;
                        ImageView imageView2 = iid0Var.N;
                        TextView textView = iid0Var.c;
                        AppCompatImageView appCompatImageView = iid0Var.L;
                        LiveTimerTextView liveTimerTextView = iid0Var.M;
                        frameLayout.setBackgroundColor(frameLayout.getContext().getColor(R.color.bg_secondary_d_lightest));
                        List<OutcomeButton> listK = kotlin.collections.b.k(iid0Var.w, iid0Var.y, iid0Var.z, iid0Var.A);
                        for (OutcomeButton outcomeButton : listK) {
                            outcomeButton.getClass();
                            outcomeButton.setVisibility(8);
                        }
                        Iterator it = list.iterator();
                        int i10 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            final Event event2 = event;
                            if (!zHasNext) {
                                LinearLayout linearLayout = iid0Var.f;
                                final Function1 function4 = function1;
                                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: yks
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        function4.invoke(event2);
                                    }
                                });
                                iid0Var.e.setText(event2.homeTeamName);
                                iid0Var.b.setText(event2.awayTeamName);
                                String str2 = event2.eventId;
                                str2.getClass();
                                liveTimerTextView.setLiveTime(str2, event2.playedSeconds, event2.matchStatus, event2.status);
                                liveTimerTextView.setTypeface(Typeface.DEFAULT_BOLD);
                                iid0Var.i.setVisibility(8);
                                c8i0.o(appCompatImageView, event2.showStats());
                                final Function1 function5 = function2;
                                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: zks
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        function5.invoke(event2);
                                    }
                                });
                                textView.setText(str);
                                c8i0.o(textView, z3);
                                iid0Var.H.setVisibility(8);
                                iid0Var.v.setText(strA);
                                c8i0.o(iid0Var.K, event2.hasLiveStream());
                                c8i0.o(iid0Var.I, event2.hasAudioStream());
                                c8i0.o(iid0Var.J, event2.hasGift());
                                iid0Var.D.setVisibility(8);
                                if (event2.topTeam) {
                                    Context context = frameLayout.getContext();
                                    context.getClass();
                                    int iA = fug0.a(hug0.a, context);
                                    if (iA == 0) {
                                        i9 = R.drawable.spr_sports_hot;
                                    } else if (iA == 1) {
                                        i9 = R.drawable.spr_sports_hot_sw;
                                    } else if (iA == 2 || iA == 3 || iA == 4) {
                                        i9 = R.drawable.spr_sports_hot_es_mx;
                                    } else {
                                        if (iA != 5) {
                                            uhc.a();
                                            return null;
                                        }
                                        i9 = R.drawable.spr_sports_hot_fr_fr;
                                    }
                                    imageView2.setImageDrawable(gr0.a(context, i9));
                                    imageView2.setVisibility(0);
                                } else {
                                    imageView2.setVisibility(8);
                                }
                                if (event2.oddsBoost) {
                                    Context context2 = frameLayout.getContext();
                                    context2.getClass();
                                    int iA2 = fug0.a(hug0.a, context2);
                                    if (iA2 == 0) {
                                        i8 = R.drawable.spr_odds_boost;
                                    } else if (iA2 == 1) {
                                        i8 = R.drawable.spr_odds_boost_sw;
                                    } else if (iA2 == 2) {
                                        i8 = R.drawable.spr_odds_boost_es_mx;
                                    } else if (iA2 == 3) {
                                        i8 = R.drawable.spr_odds_boost_pt_br;
                                    } else if (iA2 == 4) {
                                        i8 = R.drawable.spr_odds_boost_pt_mz;
                                    } else {
                                        if (iA2 != 5) {
                                            uhc.a();
                                            return null;
                                        }
                                        i8 = R.drawable.spr_odds_boost_fr_fr;
                                    }
                                    imageView.setImageDrawable(gr0.a(context2, i8));
                                    i7 = 0;
                                    imageView.setVisibility(0);
                                    i6 = 8;
                                } else {
                                    i6 = 8;
                                    i7 = 0;
                                    imageView.setVisibility(8);
                                }
                                iid0Var.F.setVisibility(i6);
                                ArrayList arrayListA = mfb0Var.A(event2.setScore, event2.pointScore, event2.gameScore);
                                GridLayout gridLayout = iid0Var.C;
                                gridLayout.removeAllViews();
                                gridLayout.setRowCount(2);
                                gridLayout.setColumnCount(arrayListA.size() / 2);
                                int size = arrayListA.size();
                                int i11 = i7;
                                while (i11 < size) {
                                    Object obj2 = arrayListA.get(i11);
                                    i11++;
                                    String str3 = (String) obj2;
                                    Context context3 = gridLayout.getContext();
                                    context3.getClass();
                                    str3.getClass();
                                    TextView textView2 = new TextView(context3);
                                    textView2.setMinWidth(r0b.a(context3, 16));
                                    textView2.setText(str3);
                                    textView2.setTextSize(12.0f);
                                    textView2.setTextColor(context3.getColor(R.color.absolute_type2));
                                    gridLayout.addView(textView2);
                                }
                                return Unit.a;
                            }
                            Object next = it.next();
                            int i12 = i10 + 1;
                            if (i10 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            final Outcome outcome = (Outcome) next;
                            Object obj3 = listK.get(i10);
                            obj3.getClass();
                            final OutcomeButton outcomeButton2 = (OutcomeButton) obj3;
                            final Market market2 = market;
                            if (market2.status == 0 && outcome.isActive == 1) {
                                String str4 = outcome.odds;
                                str4.getClass();
                                if (str4.length() > 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                            } else {
                                z5 = false;
                            }
                            outcomeButton2.setVisibility(0);
                            outcomeButton2.setBackgroundResource(R.drawable.bg_filled_brand_secondary_variable_type1_with_brand_secondary);
                            List list2 = listK;
                            outcomeButton2.setTextColor(o0b.b(outcomeButton2.getContext(), R.color.text_color_custom_brand_secondary_variable_type2_type3_with_brand_tertiary));
                            if (z5) {
                                outcomeButton2.setTag(new Selection(event2, market2, outcome));
                                outcomeButton2.setEnabled(true);
                                String str5 = outcome.odds;
                                str5.getClass();
                                outcomeButton2.setOdds(str5);
                                int i13 = outcome.flag;
                                if (i13 == 1) {
                                    outcomeButton2.g();
                                    outcome.flag = 0;
                                } else if (i13 == 2) {
                                    outcomeButton2.c();
                                    outcome.flag = 0;
                                }
                            } else {
                                outcomeButton2.setImage(R.drawable.spr_ic_prematch_lock, false);
                                outcomeButton2.setEnabled(false);
                            }
                            outcomeButton2.b();
                            final f8z f8zVar = (f8z) gajVar4.invoke(event2, market2, outcome);
                            outcomeButton2.setChecked(f8zVar.a);
                            BigDecimal bigDecimal = f8zVar.b;
                            if (bigDecimal != null) {
                                String str6 = outcome.odds;
                                str6.getClass();
                                kuh.e(outcomeButton2, bigDecimal, str6, frameLayout, ku1.b, false);
                            }
                            final jaj jajVar2 = jajVar;
                            outcomeButton2.setOnClickListener(new View.OnClickListener() { // from class: xks
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    boolean z6 = f8zVar.b != null;
                                    OutcomeButton outcomeButton3 = outcomeButton2;
                                    if (((Boolean) jajVar2.l(event2, market2, outcome, Boolean.valueOf(outcomeButton3.isChecked()), Boolean.valueOf(z6))).booleanValue()) {
                                        return;
                                    }
                                    outcomeButton3.setChecked(!outcomeButton3.isChecked());
                                }
                            });
                            i10 = i12;
                            listK = list2;
                        }
                    }
                };
                bVarI.r(function3);
                objY2 = function3;
            } else {
                z3 = z4;
            }
            id0.a(gajVar3, dVarI, (Function1) objY2, bVarI, 54);
            z2 = z3;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wks
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    als.a(mfb0Var, event, market, list, function1, function2, jajVar, gajVar, z2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
