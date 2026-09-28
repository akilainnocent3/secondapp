package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import com.sporty.android.core.model.account.MyFavoriteStake;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rop implements Function1 {
    public final /* synthetic */ KeyboardView a;
    public final /* synthetic */ cid0 b;
    public final /* synthetic */ List c;

    public /* synthetic */ rop(KeyboardView keyboardView, cid0 cid0Var, List list) {
        this.a = keyboardView;
        this.b = cid0Var;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BigDecimal bigDecimalDivide;
        BigDecimal bigDecimalDivide2;
        BigDecimal bigDecimalDivide3;
        MyFavoriteStake myFavoriteStake = (MyFavoriteStake) obj;
        int i = KeyboardView.b0;
        KeyboardView keyboardView = this.a;
        boolean zIsLogin = keyboardView.getAccountHelper().isLogin();
        cid0 cid0Var = this.b;
        List list = this.c;
        if (!zIsLogin || myFavoriteStake == null) {
            AppCompatTextView appCompatTextView = cid0Var.e;
            Object obj2 = list.get(0);
            obj2.getClass();
            keyboardView.J(appCompatTextView, (BigDecimal) obj2);
            AppCompatTextView appCompatTextView2 = cid0Var.f;
            Object obj3 = list.get(1);
            obj3.getClass();
            keyboardView.J(appCompatTextView2, (BigDecimal) obj3);
            AppCompatTextView appCompatTextView3 = cid0Var.i;
            Object obj4 = list.get(2);
            obj4.getClass();
            keyboardView.J(appCompatTextView3, (BigDecimal) obj4);
            return Unit.a;
        }
        AppCompatTextView appCompatTextView4 = cid0Var.e;
        Double quickAddStake1 = myFavoriteStake.getQuickAddStake1();
        if (quickAddStake1 != null) {
            bigDecimalDivide = BigDecimal.valueOf(quickAddStake1.doubleValue()).divide(BigDecimal.valueOf(10000L));
            bigDecimalDivide.getClass();
        } else {
            bigDecimalDivide = (BigDecimal) list.get(0);
        }
        bigDecimalDivide.getClass();
        keyboardView.J(appCompatTextView4, bigDecimalDivide);
        AppCompatTextView appCompatTextView5 = cid0Var.f;
        Double quickAddStake2 = myFavoriteStake.getQuickAddStake2();
        if (quickAddStake2 != null) {
            bigDecimalDivide2 = BigDecimal.valueOf(quickAddStake2.doubleValue()).divide(BigDecimal.valueOf(10000L));
            bigDecimalDivide2.getClass();
        } else {
            bigDecimalDivide2 = (BigDecimal) list.get(1);
        }
        bigDecimalDivide2.getClass();
        keyboardView.J(appCompatTextView5, bigDecimalDivide2);
        AppCompatTextView appCompatTextView6 = cid0Var.i;
        Double quickAddStake3 = myFavoriteStake.getQuickAddStake3();
        if (quickAddStake3 != null) {
            bigDecimalDivide3 = BigDecimal.valueOf(quickAddStake3.doubleValue()).divide(BigDecimal.valueOf(10000L));
            bigDecimalDivide3.getClass();
        } else {
            bigDecimalDivide3 = (BigDecimal) list.get(2);
        }
        bigDecimalDivide3.getClass();
        keyboardView.J(appCompatTextView6, bigDecimalDivide3);
        return Unit.a;
    }
}
