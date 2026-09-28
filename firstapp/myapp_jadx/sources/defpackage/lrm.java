package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.AliasBookingCode;
import com.sportybet.plugin.realsports.data.Share;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public interface lrm {
    boolean A();

    ConcurrentHashMap B();

    Selection C();

    void D(String str);

    void E(boolean z);

    Selection F();

    void G(boolean z);

    Selection H();

    String I(Selection selection);

    boolean J();

    void K(boolean z);

    void L(imn imnVar);

    boolean M();

    void N(Selection selection);

    void O(Selection selection, String str);

    void P(String str, imn imnVar);

    void Q(Selection selection);

    BigDecimal R();

    void S();

    void T(Selection selection, String str);

    List<ln7> U();

    int V();

    BigDecimal W(int i);

    BigDecimal X();

    void Y(long j);

    long Z();

    double a();

    List<ln7> a0();

    HashMap b();

    String b0();

    String c();

    void c0(Selection selection);

    void clear();

    void d();

    imn d0();

    void e(int i);

    imn e0();

    BigDecimal f();

    AliasBookingCode f0();

    Share g();

    void g0(String str, String str2, String str3);

    int getTypeName();

    void h();

    void h0(String str);

    void i(imn imnVar);

    void j(BetslipActivity betslipActivity);

    void k(AliasBookingCode aliasBookingCode);

    void l(boolean z);

    BigDecimal m(int i, boolean z);

    void n();

    boolean o();

    void p();

    void q(int i);

    void r(EditTextWithKeyBoard editTextWithKeyBoard);

    long s(String str);

    void t(String str);

    HashMap u();

    void v(Selection selection);

    void w(Share share);

    void x(String str);

    BigDecimal y();

    BigDecimal z();
}
