package defpackage;

import com.sporty.android.core.model.instantwin.InstantWinPromotionData;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$isEligible$1", f = "InstantWinPromotionManagerImpl.kt", l = {122, 123}, m = "invokeSuspend", v = 2)
public final class oio extends tje0 implements jaj<lk50<? extends InstantWinPromotionData>, Boolean, Set<? extends String>, Integer, v1b<? super Boolean>, Object> {
    public InstantWinPromotionData a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ lk50 f;
    public /* synthetic */ boolean i;
    public /* synthetic */ Set v;
    public final /* synthetic */ pio w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oio(v1b v1bVar, pio pioVar) {
        super(5, v1bVar);
        this.w = pioVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        InstantWinPromotionData instantWinPromotionData;
        int iIntValue;
        boolean zIsLogin;
        Object string;
        Integer maxPopupTimes;
        InstantWinPromotionData instantWinPromotionData2;
        boolean z;
        int i;
        Object[] objArr;
        pio pioVar = this.w;
        yho yhoVar = pioVar.b;
        lk50 lk50Var = this.f;
        boolean z2 = this.i;
        Set set = this.v;
        y5b y5bVar = y5b.a;
        int i2 = this.e;
        boolean z3 = false;
        if (i2 == 0) {
            uj50.b(obj);
            lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
            instantWinPromotionData = cVar != null ? (InstantWinPromotionData) cVar.a : null;
            iIntValue = (instantWinPromotionData == null || (maxPopupTimes = instantWinPromotionData.getMaxPopupTimes()) == null) ? 0 : maxPopupTimes.intValue();
            zIsLogin = pioVar.c.isLogin();
            this.f = null;
            this.v = set;
            this.a = instantWinPromotionData;
            this.i = z2;
            this.c = iIntValue;
            this.b = zIsLogin;
            this.e = 1;
            string = yhoVar.a.getString("lastDialogDay", "", this);
            if (string != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            zIsLogin = this.b;
            iIntValue = this.c;
            InstantWinPromotionData instantWinPromotionData3 = this.a;
            uj50.b(obj);
            string = obj;
            instantWinPromotionData = instantWinPromotionData3;
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.d;
            z = this.b;
            iIntValue = this.c;
            instantWinPromotionData2 = this.a;
            uj50.b(obj);
        }
        int iIntValue2 = ((Number) obj).intValue();
        if (iIntValue > 0 || iIntValue2 >= iIntValue) {
            objArr = false;
        } else {
            objArr = true;
        }
        boolean zContains = set.contains("sr:sport:1");
        if (instantWinPromotionData2 != null && z2 && z && zContains && i != 0 && objArr != false) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
        int i3 = !Intrinsics.g(string, pio.f()) ? 1 : 0;
        this.f = null;
        this.v = set;
        this.a = instantWinPromotionData;
        this.i = z2;
        this.c = iIntValue;
        this.b = zIsLogin;
        this.d = i3;
        this.e = 2;
        Object obj2 = yhoVar.a.getInt("dialogCount", 0, this);
        if (obj2 != y5bVar) {
            InstantWinPromotionData instantWinPromotionData4 = instantWinPromotionData;
            obj = obj2;
            instantWinPromotionData2 = instantWinPromotionData4;
            z = zIsLogin;
            i = i3;
            int iIntValue3 = ((Number) obj).intValue();
            if (iIntValue > 0) {
                objArr = false;
            } else {
                objArr = false;
            }
            boolean zContains2 = set.contains("sr:sport:1");
            if (instantWinPromotionData2 != null) {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
        return y5bVar;
    }

    @Override // defpackage.jaj
    public final Object l(lk50<? extends InstantWinPromotionData> lk50Var, Boolean bool, Set<? extends String> set, Integer num, v1b<? super Boolean> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        oio oioVar = new oio(v1bVar, this.w);
        oioVar.f = lk50Var;
        oioVar.i = zBooleanValue;
        oioVar.v = set;
        return oioVar.invokeSuspend(Unit.a);
    }
}
