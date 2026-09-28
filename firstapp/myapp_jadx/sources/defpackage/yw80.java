package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.remote.models.BetHistoryItem;
import com.sportygames.crash.remote.models.TopWinResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class yw80 extends Dialog implements t2g0.a, t2g0.b {
    public String A;
    public boolean B;
    public e a;
    public k6c0 b;
    public ibs c;
    public String d;
    public String e;
    public jo70 f;
    public rdg i;
    public or7 v;
    public bsb0 w;
    public cx80 y;
    public String z;

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

    @Override // t2g0.a
    public final void a(String str) {
        str.getClass();
        k6c0 k6c0Var = this.b;
        k6c0Var.getClass();
        ej5.c(o8i0.d(k6c0Var), null, null, new h6c0(k6c0Var, str, "Fairness", null, null), 3);
        e();
    }

    @Override // t2g0.b
    public final void b(TopWinResponse topWinResponse) {
        topWinResponse.getClass();
        k6c0 k6c0Var = this.b;
        String betId = topWinResponse.getBetId();
        k6c0Var.getClass();
        betId.getClass();
        ej5.c(o8i0.d(k6c0Var), null, null, new h6c0(k6c0Var, betId, "ShareChat", topWinResponse, null), 3);
        e();
    }

    public final cx80 c() {
        cx80 cx80Var = this.y;
        if (cx80Var != null) {
            return cx80Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final void d(final String str, final Function0<Boolean> function0, final Function0<Unit> function1) {
        this.b.d.f(this.c, new b(new Function1() { // from class: ww80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List list;
                Integer code;
                yw80 yw80Var = this.a;
                e eVar = yw80Var.a;
                LoadingState loadingState = (LoadingState) obj;
                int i = yw80.a.a[loadingState.getStatus().ordinal()];
                int i2 = 1;
                if (i == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        yw80Var.c().z.setLayoutManager(new LinearLayoutManager(1, false));
                        boolean zG = Intrinsics.g(str, eVar.getString(R.string.payout_amount));
                        e eVar2 = yw80Var.a;
                        if (zG) {
                            yw80Var.c().z.setAdapter(new t2g0(list, eVar2, yw80Var.e, yw80Var, yw80Var, function0, function1));
                        } else {
                            yw80Var.c().z.setAdapter(new b3g0(eVar2, list));
                        }
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        uhc.a();
                        return null;
                    }
                    yw80Var.dismiss();
                    ResultWrapper.GenericError error = loadingState.getError();
                    if (error == null || (code = error.getCode()) == null || code.intValue() != 403) {
                        us80 us80Var = us80.d;
                        e eVar3 = yw80Var.a;
                        ResultWrapper.GenericError error2 = loadingState.getError();
                        f24 f24Var = new f24(yw80Var, i2);
                        npm npmVar = new npm(3);
                        mw80 mw80Var = new mw80();
                        eVar.getColor(R.color.try_again_color);
                        us80Var.c(eVar3, error2, f24Var, npmVar, mw80Var, 0, (1024 & 128) != 0 ? new ita(1) : null, (1024 & 512) != 0 ? new pm60() : null, new qm60());
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
        k6c0 k6c0Var = this.b;
        ssw<LoadingState<HTTPResponse<TopWinResponse>>> sswVar = new ssw<>();
        k6c0Var.getClass();
        k6c0Var.e = sswVar;
        k6c0Var.e.l(this.c);
        super.dismiss();
    }

    public final void e() {
        try {
            if (this.B) {
                this.B = true;
            } else {
                this.B = true;
                this.b.e.f(this.c, new b(new Function1() { // from class: lw80
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        TopWinResponse topWinResponse;
                        String roundId;
                        Double dH;
                        LoadingState loadingState = (LoadingState) obj;
                        int i = yw80.a.a[loadingState.getStatus().ordinal()];
                        if (i == 1) {
                            HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                            TopWinResponse topWinResponse2 = hTTPResponse != null ? (TopWinResponse) hTTPResponse.getData() : null;
                            boolean zG = Intrinsics.g(topWinResponse2 != null ? topWinResponse2.isCalledFrom() : null, "ShareChat");
                            yw80 yw80Var = this.a;
                            if (zG) {
                                TopWinResponse topWinOther = topWinResponse2.getTopWinOther();
                                topWinResponse2.setCountryCode(topWinOther != null ? topWinOther.getCountryCode() : null);
                                topWinResponse2.setPayoutOrCoefficient(topWinOther != null ? topWinOther.getPayoutOrCoefficient() : null);
                                topWinResponse2.setTimeRange(topWinOther != null ? topWinOther.getTimeRange() : null);
                                topWinResponse2.setUpdateTime(topWinOther != null ? topWinOther.getUpdateTime() : null);
                                yw80Var.dismiss();
                                bsb0 bsb0Var = yw80Var.w;
                                String str = yw80Var.e;
                                String str2 = yw80Var.d;
                                Double dValueOf = Double.valueOf(0.0d);
                                String strValueOf = String.valueOf(topWinResponse2.getUserId());
                                String roundId2 = topWinResponse2.getRoundId();
                                if (roundId2 == null) {
                                    roundId2 = "";
                                }
                                Double cashOutCoefficient = topWinResponse2.getCashOutCoefficient();
                                if (cashOutCoefficient == null) {
                                    String cashoutCoefficient = topWinResponse2.getCashoutCoefficient();
                                    dH = cashoutCoefficient != null ? b.h(cashoutCoefficient) : null;
                                } else {
                                    dH = cashOutCoefficient;
                                }
                                String cashoutCoefficient2 = topWinResponse2.getCashoutCoefficient();
                                Double dH2 = b.h(topWinResponse2.getPayoutAmount());
                                double dDoubleValue = dH2 != null ? dH2.doubleValue() : 0.0d;
                                Double dH3 = b.h(topWinResponse2.getStakeAmount());
                                double dDoubleValue2 = dH3 != null ? dH3.doubleValue() : 0.0d;
                                String currency = topWinResponse2.getCurrency();
                                Double houseCoefficient = topWinResponse2.getHouseCoefficient();
                                double dDoubleValue3 = houseCoefficient != null ? houseCoefficient.doubleValue() : 0.0d;
                                Long lS0 = StringsKt.s0(topWinResponse2.getBetId());
                                long jLongValue = lS0 != null ? lS0.longValue() : 0L;
                                Double dH4 = b.h(topWinResponse2.getPayoutAmount());
                                double dDoubleValue4 = dH4 != null ? dH4.doubleValue() : 0.0d;
                                String betId = topWinResponse2.getBetId();
                                String updateTime = topWinResponse2.getUpdateTime();
                                String str3 = updateTime == null ? "" : updateTime;
                                Double dH5 = b.h(topWinResponse2.getStakeAmount());
                                double dDoubleValue5 = dH5 != null ? dH5.doubleValue() : 0.0d;
                                Double bonusPercentage = topWinResponse2.getBonusPercentage();
                                double dDoubleValue6 = bonusPercentage != null ? bonusPercentage.doubleValue() : 0.0d;
                                Integer level = topWinResponse2.getLevel();
                                Double bonusAwardAmount = topWinResponse2.getBonusAwardAmount();
                                double dDoubleValue7 = bonusAwardAmount != null ? bonusAwardAmount.doubleValue() : 0.0d;
                                Double cashoutAmount = topWinResponse2.getCashoutAmount();
                                bsb0Var.invoke(str, str2, new BetHistoryItem(strValueOf, roundId2, null, dH, null, dValueOf, dValueOf, dValueOf, cashoutCoefficient2, dDoubleValue, dDoubleValue2, null, currency, dDoubleValue3, null, null, 0.0d, jLongValue, "", dDoubleValue4, betId, str3, dDoubleValue5, "1", Double.valueOf(dDoubleValue6), level, Double.valueOf(dDoubleValue7), Double.valueOf(cashoutAmount != null ? cashoutAmount.doubleValue() : 0.0d), false, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, false, -268435456, 15, null));
                            } else {
                                HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                                if (hTTPResponse2 != null && (topWinResponse = (TopWinResponse) hTTPResponse2.getData()) != null && (roundId = topWinResponse.getRoundId()) != null) {
                                    yw80Var.v.invoke(roundId);
                                }
                                wz.a("FairnessClicked", "Sporty Hero", "top wins");
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
            this.y = cx80.a(getLayoutInflater());
            setContentView(c().a);
            this.b.x1(this.z, this.A);
            String string = this.a.getString(R.string.payout_amount);
            string.getClass();
            d(string, this.f, this.i);
            c().e.setOnClickListener(new imh(this, 1));
            c().b.setVisibility(8);
            c().w.setOnClickListener(new kmh(this, 1));
            c().c.setOnClickListener(new mmh(this, 1));
            c().i.setOnClickListener(new View.OnClickListener() { // from class: rw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yw80 yw80Var = this.a;
                    e eVar = yw80Var.a;
                    String string2 = eVar.getString(R.string.cashout_coefficient);
                    string2.getClass();
                    yw80Var.z = string2;
                    String string3 = eVar.getString(R.string.daily);
                    string3.getClass();
                    yw80Var.A = string3;
                    yw80Var.b.x1(yw80Var.z, string3);
                    yw80Var.d(yw80Var.z, yw80Var.f, yw80Var.i);
                    yw80Var.c().i.setTextColor(eVar.getColor(R.color.swipe_color));
                    yw80Var.c().i.setBackgroundColor(eVar.getColor(R.color.sb_black_100));
                    yw80Var.c().c.setBackgroundColor(eVar.getColor(R.color.sh_unselected_bg_dark_theme));
                    yw80Var.c().c.setTextColor(eVar.getColor(R.color.text_secondary));
                    yw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    yw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    yw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                }
            });
            c().A.setOnClickListener(new View.OnClickListener() { // from class: tw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yw80 yw80Var = this.a;
                    e eVar = yw80Var.a;
                    String string2 = eVar.getString(R.string.monthly);
                    string2.getClass();
                    yw80Var.A = string2;
                    yw80Var.b.x1(yw80Var.z, string2);
                    yw80Var.d(yw80Var.z, yw80Var.f, yw80Var.i);
                    yw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    yw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    yw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                }
            });
            c().E.setOnClickListener(new View.OnClickListener() { // from class: vw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yw80 yw80Var = this.a;
                    e eVar = yw80Var.a;
                    String string2 = eVar.getString(R.string.yearly);
                    string2.getClass();
                    yw80Var.A = string2;
                    yw80Var.b.x1(yw80Var.z, string2);
                    yw80Var.c().w.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    yw80Var.c().A.setBackgroundColor(eVar.getColor(R.color.sh_dialog_bg_dark_theme));
                    yw80Var.c().E.setBackgroundColor(eVar.getColor(R.color.bg_primary));
                    yw80Var.d(yw80Var.z, yw80Var.f, yw80Var.i);
                }
            });
            op5.r(op5.a, kotlin.collections.b.f(c().w, c().A, c().E, c().i, c().c, c().B), null, 4);
        } catch (Exception unused) {
        }
    }
}
