package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.pingpong.remote.models.TopWinResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n2g0 extends Dialog implements s2g0.a, s2g0.b {
    public boolean A;
    public e a;
    public y720 b;
    public ibs c;
    public String d;
    public String e;
    public k010 f;
    public l010 i;
    public m820 v;
    public String w;
    public String y;
    public dt80 z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    @Override // s2g0.a
    public final void a(String str) {
        str.getClass();
        y720 y720Var = this.b;
        y720Var.getClass();
        ej5.c(o8i0.d(y720Var), null, null, new b820(y720Var, str, "Fairness", null, null), 3);
        e();
    }

    @Override // s2g0.b
    public final void b(TopWinResponse topWinResponse) {
        topWinResponse.getClass();
        y720 y720Var = this.b;
        String betId = topWinResponse.getBetId();
        y720Var.getClass();
        betId.getClass();
        ej5.c(o8i0.d(y720Var), null, null, new b820(y720Var, betId, "ShareChat", topWinResponse, null), 3);
        e();
    }

    public final m820 c() {
        m820 m820Var = this.v;
        if (m820Var != null) {
            return m820Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final void d(final String str, final Function0<Boolean> function0, final Function0<Unit> function1) {
        this.b.c.f(this.c, new b(new Function1() { // from class: m2g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List list;
                Integer code;
                n2g0 n2g0Var = this.a;
                e eVar = n2g0Var.a;
                LoadingState loadingState = (LoadingState) obj;
                int i = n2g0.a.a[loadingState.getStatus().ordinal()];
                if (i != 1) {
                    int i2 = 2;
                    if (i != 2) {
                        if (i != 3) {
                            uhc.a();
                            return null;
                        }
                        n2g0Var.dismiss();
                        ResultWrapper.GenericError error = loadingState.getError();
                        if (error == null || (code = error.getCode()) == null || code.intValue() != 403) {
                            vs80 vs80Var = vs80.b;
                            e eVar2 = n2g0Var.a;
                            ResultWrapper.GenericError error2 = loadingState.getError();
                            ga8 ga8Var = new ga8(n2g0Var, i2);
                            ia8 ia8Var = new ia8(1);
                            e2g0 e2g0Var = new e2g0();
                            eVar.getColor(R.color.try_again_color);
                            vs80Var.c(eVar2, error2, ga8Var, ia8Var, e2g0Var, 0, (640 & 128) != 0 ? new mm60() : null, (640 & 512) != 0 ? new xvj(2) : null);
                        } else {
                            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                        }
                    }
                } else {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        n2g0Var.c().z.setLayoutManager(new LinearLayoutManager(1, false));
                        boolean zG = Intrinsics.g(str, eVar.getString(R.string.payout_amount));
                        e eVar3 = n2g0Var.a;
                        if (zG) {
                            n2g0Var.c().z.setAdapter(new s2g0(list, eVar3, n2g0Var.b, n2g0Var.c, n2g0Var.d, n2g0Var.e, n2g0Var, n2g0Var, function0, function1));
                        } else {
                            n2g0Var.c().z.setAdapter(new d3g0(eVar3, list));
                        }
                    }
                }
                return Unit.a;
            }
        }));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        y720 y720Var = this.b;
        ssw<LoadingState<HTTPResponse<TopWinResponse>>> sswVar = new ssw<>();
        y720Var.getClass();
        y720Var.d = sswVar;
        y720Var.d.l(this.c);
        super.dismiss();
    }

    public final void e() {
        try {
            if (this.A) {
                this.A = true;
            } else {
                this.A = true;
                this.b.d.f(this.c, new b(new Function1() { // from class: f2g0
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
                        TopWinResponse topWinResponse;
                        String roundId;
                        TopWinResponse topWinResponse2;
                        n2g0 n2g0Var = this.a;
                        e eVar = n2g0Var.a;
                        LoadingState loadingState = (LoadingState) obj;
                        int i = n2g0.a.a[loadingState.getStatus().ordinal()];
                        dt80 dt80Var = null;
                        dt80Var = null;
                        dt80Var = null;
                        if (i == 1) {
                            HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                            TopWinResponse topWinResponse3 = hTTPResponse != null ? (TopWinResponse) hTTPResponse.getData() : null;
                            if (Intrinsics.g(topWinResponse3 != null ? topWinResponse3.isCalledFrom() : null, "ShareChat")) {
                                TopWinResponse topWinOther = topWinResponse3.getTopWinOther();
                                topWinResponse3.setCountryCode(topWinOther != null ? topWinOther.getCountryCode() : null);
                                topWinResponse3.setPayoutOrCoefficient(topWinOther != null ? topWinOther.getPayoutOrCoefficient() : null);
                                topWinResponse3.setTimeRange(topWinOther != null ? topWinOther.getTimeRange() : null);
                                topWinResponse3.setUpdateTime(topWinOther != null ? topWinOther.getUpdateTime() : null);
                                Intent intent = new Intent(eVar, (Class<?>) ChatActivity.class);
                                intent.putExtra("roomId", n2g0Var.e);
                                intent.putExtra("botId", n2g0Var.d);
                                HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                                intent.putExtra("roundId", (hTTPResponse2 == null || (topWinResponse2 = (TopWinResponse) hTTPResponse2.getData()) == null) ? null : topWinResponse2.getRoundId());
                                intent.putExtra("color", R.color.toolbar_strip_bottle);
                                intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "ping pong");
                                HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                                intent.putExtra("betObject", hTTPResponse3 != null ? (TopWinResponse) hTTPResponse3.getData() : null);
                                intent.putExtra("share_data_type", "top_wins");
                                eVar.getClass();
                                Fragment fragmentG = ((GameMainActivity) eVar).getSupportFragmentManager().G(R.id.main_game_container);
                                if (fragmentG instanceof m410) {
                                    ((m410) fragmentG).h0 = true;
                                }
                                eVar.startActivity(intent);
                            } else {
                                HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                                if (hTTPResponse4 != null && (topWinResponse = (TopWinResponse) hTTPResponse4.getData()) != null && (roundId = topWinResponse.getRoundId()) != null) {
                                    dt80Var = new dt80(eVar, n2g0Var.b, n2g0Var.c, roundId);
                                }
                                dt80Var.getClass();
                                n2g0Var.z = dt80Var;
                                dt80Var.a();
                                wz.a("FairnessClicked", "Ping Pong", "top wins");
                            }
                        } else if (i != 2 && i != 3) {
                            uhc.a();
                            return null;
                        }
                        return Unit.a;
                    }
                }));
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.v = m820.a(getLayoutInflater());
            setContentView(c().a);
            setOnCancelListener(new d2g0());
            this.b.z1(this.w, this.y);
            String string = this.a.getString(R.string.payout_amount);
            string.getClass();
            d(string, this.f, this.i);
            c().e.setOnClickListener(new View.OnClickListener() { // from class: g2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.dismiss();
                    wz.a("popup_action", "Ping Pong", "top wins", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                }
            });
            c().b.setVisibility(8);
            c().w.setOnClickListener(new View.OnClickListener() { // from class: h2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n2g0 n2g0Var = this.a;
                    e eVar = n2g0Var.a;
                    String string2 = eVar.getString(R.string.daily);
                    string2.getClass();
                    n2g0Var.y = string2;
                    n2g0Var.b.z1(n2g0Var.w, string2);
                    n2g0Var.d(n2g0Var.w, n2g0Var.f, n2g0Var.i);
                    n2g0Var.c().w.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    n2g0Var.c().A.setBackgroundColor(eVar.getColor(R.color.pp_server_seed_bg));
                    n2g0Var.c().E.setBackgroundColor(eVar.getColor(R.color.pp_server_seed_bg));
                }
            });
            c().c.setOnClickListener(new View.OnClickListener() { // from class: i2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n2g0 n2g0Var = this.a;
                    e eVar = n2g0Var.a;
                    String string2 = eVar.getString(R.string.payout_amount);
                    string2.getClass();
                    n2g0Var.w = string2;
                    String string3 = eVar.getString(R.string.daily);
                    string3.getClass();
                    n2g0Var.y = string3;
                    n2g0Var.b.z1(n2g0Var.w, string3);
                    n2g0Var.d(n2g0Var.w, n2g0Var.f, n2g0Var.i);
                    n2g0Var.c().c.setTextColor(eVar.getColor(R.color.swipe_color));
                    n2g0Var.c().c.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    n2g0Var.c().i.setBackgroundColor(eVar.getColor(R.color.pp_server_seed_bg));
                    n2g0Var.c().w.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    n2g0Var.c().A.setBackgroundColor(eVar.getColor(R.color.pp_server_seed_bg));
                    n2g0Var.c().E.setBackgroundColor(eVar.getColor(R.color.pp_server_seed_bg));
                    n2g0Var.c().i.setTextColor(eVar.getColor(R.color.white));
                }
            });
            c().i.setOnClickListener(new View.OnClickListener() { // from class: j2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n2g0 n2g0Var = this.a;
                    e eVar = n2g0Var.a;
                    String string2 = eVar.getString(R.string.cashout_coefficient);
                    string2.getClass();
                    n2g0Var.w = string2;
                    String string3 = eVar.getString(R.string.daily);
                    string3.getClass();
                    n2g0Var.y = string3;
                    n2g0Var.b.z1(n2g0Var.w, string3);
                    n2g0Var.d(n2g0Var.w, n2g0Var.f, n2g0Var.i);
                    n2g0Var.c().i.setTextColor(eVar.getColor(R.color.swipe_color));
                    n2g0Var.c().i.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    n2g0Var.c().c.setBackgroundColor(eVar.getColor(R.color.pp_server_seed_bg));
                    n2g0Var.c().c.setTextColor(eVar.getColor(R.color.white));
                    n2g0Var.c().w.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    n2g0Var.c().A.setBackgroundColor(eVar.getColor(R.color.pp_setting_bg));
                    n2g0Var.c().E.setBackgroundColor(eVar.getColor(R.color.pp_setting_bg));
                }
            });
            c().A.setOnClickListener(new View.OnClickListener() { // from class: k2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n2g0 n2g0Var = this.a;
                    e eVar = n2g0Var.a;
                    String string2 = eVar.getString(R.string.monthly);
                    string2.getClass();
                    n2g0Var.y = string2;
                    n2g0Var.b.z1(n2g0Var.w, string2);
                    n2g0Var.d(n2g0Var.w, n2g0Var.f, n2g0Var.i);
                    n2g0Var.c().w.setBackgroundColor(eVar.getColor(R.color.pp_setting_bg));
                    n2g0Var.c().A.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    n2g0Var.c().E.setBackgroundColor(eVar.getColor(R.color.pp_setting_bg));
                }
            });
            c().E.setOnClickListener(new View.OnClickListener() { // from class: l2g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n2g0 n2g0Var = this.a;
                    e eVar = n2g0Var.a;
                    String string2 = eVar.getString(R.string.yearly);
                    string2.getClass();
                    n2g0Var.y = string2;
                    n2g0Var.b.z1(n2g0Var.w, string2);
                    n2g0Var.c().w.setBackgroundColor(eVar.getColor(R.color.pp_setting_bg));
                    n2g0Var.c().A.setBackgroundColor(eVar.getColor(R.color.pp_setting_bg));
                    n2g0Var.c().E.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    n2g0Var.d(n2g0Var.w, n2g0Var.f, n2g0Var.i);
                }
            });
            op5.r(op5.a, kotlin.collections.b.f(c().w, c().A, c().E, c().i, c().c, c().B), null, 4);
        } catch (Exception unused) {
        }
    }
}
