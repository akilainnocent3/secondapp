package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.sportyherov2.remote.models.TopWinResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class zw80 extends Dialog implements u2g0.a, u2g0.b {
    public boolean A;
    public e a;
    public c28 b;
    public ibs c;
    public String d;
    public String e;
    public gwb0 f;
    public wvb i;
    public cx80 v;
    public String w;
    public String y;
    public et80 z;

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

    @Override // u2g0.a
    public final void a(String str) {
        str.getClass();
        c28 c28Var = this.b;
        c28Var.getClass();
        ej5.c(o8i0.d(c28Var), null, null, new h28(c28Var, str, "Fairness", null, null), 3);
        e();
    }

    @Override // u2g0.b
    public final void b(TopWinResponse topWinResponse) {
        topWinResponse.getClass();
        c28 c28Var = this.b;
        String betId = topWinResponse.getBetId();
        c28Var.getClass();
        betId.getClass();
        ej5.c(o8i0.d(c28Var), null, null, new h28(c28Var, betId, "ShareChat", topWinResponse, null), 3);
        e();
    }

    public final cx80 c() {
        cx80 cx80Var = this.v;
        if (cx80Var != null) {
            return cx80Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final void d(final String str, final Function0<Boolean> function0, final Function0<Unit> function1) {
        this.b.c.f(this.c, new b(new Function1() { // from class: uw80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List list;
                Integer code;
                zw80 zw80Var = this.a;
                e eVar = zw80Var.a;
                LoadingState loadingState = (LoadingState) obj;
                int i = zw80.a.a[loadingState.getStatus().ordinal()];
                int i2 = 1;
                if (i == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        zw80Var.c().z.setLayoutManager(new LinearLayoutManager(1, false));
                        boolean zG = Intrinsics.g(str, eVar.getString(R.string.payout_amount));
                        e eVar2 = zw80Var.a;
                        if (zG) {
                            zw80Var.c().z.setAdapter(new u2g0(list, eVar2, zw80Var.e, zw80Var, zw80Var, function0, function1));
                        } else {
                            zw80Var.c().z.setAdapter(new c3g0(eVar2, list));
                        }
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        uhc.a();
                        return null;
                    }
                    zw80Var.dismiss();
                    ResultWrapper.GenericError error = loadingState.getError();
                    if (error == null || (code = error.getCode()) == null || code.intValue() != 403) {
                        us80 us80Var = us80.d;
                        e eVar3 = zw80Var.a;
                        ResultWrapper.GenericError error2 = loadingState.getError();
                        tmh tmhVar = new tmh(zw80Var, i2);
                        xw80 xw80Var = new xw80();
                        mpm mpmVar = new mpm(1);
                        eVar.getColor(R.color.try_again_color);
                        us80Var.c(eVar3, error2, tmhVar, xw80Var, mpmVar, 0, (1024 & 128) != 0 ? new ita(1) : null, (1024 & 512) != 0 ? new pm60() : null, new qm60());
                    } else {
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    }
                }
                return Unit.a;
            }
        }));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        c28 c28Var = this.b;
        ssw<LoadingState<HTTPResponse<TopWinResponse>>> sswVar = new ssw<>();
        c28Var.getClass();
        c28Var.e = sswVar;
        c28Var.e.l(this.c);
        super.dismiss();
    }

    public final void e() {
        try {
            if (this.A) {
                this.A = true;
            } else {
                this.A = true;
                this.b.e.f(this.c, new b(new nsc(this, 1)));
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.v = cx80.a(getLayoutInflater());
            setContentView(c().a);
            this.b.z1(this.w, this.y);
            String string = this.a.getString(R.string.payout_amount);
            string.getClass();
            d(string, this.f, this.i);
            c().e.setOnClickListener(new View.OnClickListener() { // from class: kw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.dismiss();
                    wz.a("popup_action", "Sporty Hero", "top wins", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                }
            });
            c().b.setVisibility(8);
            c().w.setOnClickListener(new View.OnClickListener() { // from class: nw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zw80 zw80Var = this.a;
                    e eVar = zw80Var.a;
                    String string2 = eVar.getString(R.string.daily);
                    string2.getClass();
                    zw80Var.y = string2;
                    zw80Var.b.z1(zw80Var.w, string2);
                    zw80Var.d(zw80Var.w, zw80Var.f, zw80Var.i);
                    zw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    zw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    zw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                }
            });
            c().c.setOnClickListener(new View.OnClickListener() { // from class: ow80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zw80 zw80Var = this.a;
                    e eVar = zw80Var.a;
                    String string2 = eVar.getString(R.string.payout_amount);
                    string2.getClass();
                    zw80Var.w = string2;
                    String string3 = eVar.getString(R.string.daily);
                    string3.getClass();
                    zw80Var.y = string3;
                    zw80Var.b.z1(zw80Var.w, string3);
                    zw80Var.d(zw80Var.w, zw80Var.f, zw80Var.i);
                    zw80Var.c().c.setTextColor(eVar.getColor(R.color.swipe_color));
                    zw80Var.c().c.setBackgroundColor(eVar.getColor(R.color.sb_black_100));
                    zw80Var.c().i.setBackgroundColor(eVar.getColor(R.color.sh_unselected_bg_dark_theme));
                    zw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    zw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    zw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    zw80Var.c().i.setTextColor(eVar.getColor(R.color.text_secondary));
                }
            });
            c().i.setOnClickListener(new View.OnClickListener() { // from class: pw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zw80 zw80Var = this.a;
                    e eVar = zw80Var.a;
                    String string2 = eVar.getString(R.string.cashout_coefficient);
                    string2.getClass();
                    zw80Var.w = string2;
                    String string3 = eVar.getString(R.string.daily);
                    string3.getClass();
                    zw80Var.y = string3;
                    zw80Var.b.z1(zw80Var.w, string3);
                    zw80Var.d(zw80Var.w, zw80Var.f, zw80Var.i);
                    zw80Var.c().i.setTextColor(eVar.getColor(R.color.swipe_color));
                    zw80Var.c().i.setBackgroundColor(eVar.getColor(R.color.sb_black_100));
                    zw80Var.c().c.setBackgroundColor(eVar.getColor(R.color.sh_unselected_bg_dark_theme));
                    zw80Var.c().c.setTextColor(eVar.getColor(R.color.text_secondary));
                    zw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    zw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    zw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                }
            });
            c().A.setOnClickListener(new View.OnClickListener() { // from class: qw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zw80 zw80Var = this.a;
                    e eVar = zw80Var.a;
                    String string2 = eVar.getString(R.string.monthly);
                    string2.getClass();
                    zw80Var.y = string2;
                    zw80Var.b.z1(zw80Var.w, string2);
                    zw80Var.d(zw80Var.w, zw80Var.f, zw80Var.i);
                    zw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    zw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    zw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                }
            });
            c().E.setOnClickListener(new View.OnClickListener() { // from class: sw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zw80 zw80Var = this.a;
                    e eVar = zw80Var.a;
                    String string2 = eVar.getString(R.string.yearly);
                    string2.getClass();
                    zw80Var.y = string2;
                    zw80Var.b.z1(zw80Var.w, string2);
                    zw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    zw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    zw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    zw80Var.d(zw80Var.w, zw80Var.f, zw80Var.i);
                }
            });
            op5.r(op5.a, kotlin.collections.b.f(c().w, c().A, c().E, c().i, c().c, c().B), null, 4);
        } catch (Exception unused) {
        }
    }
}
