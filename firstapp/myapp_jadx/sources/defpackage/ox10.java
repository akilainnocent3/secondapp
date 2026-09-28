package defpackage;

import com.sportygames.pocketrocket.component.PrTopWin;
import com.sportygames.pocketrocket.component.PrUserBet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ox10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ox10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zt50 zt50Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj2;
                if (((Boolean) obj).booleanValue()) {
                    String str = zy10Var.B0;
                    if (Intrinsics.g(str, "Top Wins")) {
                        zt50 zt50Var2 = zy10Var.b;
                        if (zt50Var2 != null) {
                            PrTopWin prTopWin = zt50Var2.X;
                            fn1 fn1VarB1 = zy10Var.b1();
                            ibs viewLifecycleOwner = zy10Var.getViewLifecycleOwner();
                            viewLifecycleOwner.getClass();
                            prTopWin.a(fn1VarB1, viewLifecycleOwner);
                        }
                    } else if (Intrinsics.g(str, "My Bets") && zy10Var.h1() && (zt50Var = zy10Var.b) != null) {
                        PrUserBet prUserBet = zt50Var.Z;
                        fn1 fn1VarB2 = zy10Var.b1();
                        ibs viewLifecycleOwner2 = zy10Var.getViewLifecycleOwner();
                        viewLifecycleOwner2.getClass();
                        prUserBet.b(fn1VarB2, viewLifecycleOwner2, false);
                    }
                }
                break;
            default:
                Function1 function1 = (Function1) obj2;
                ijf0 ijf0VarB = (ijf0) obj;
                ijf0VarB.getClass();
                nk0 nk0Var = ijf0VarB.a;
                long j = ijf0VarB.b;
                String str2 = nk0Var.b;
                StringBuilder sb = new StringBuilder();
                int length = str2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str2.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String strK = wae0.K(16, sb.toString());
                if (!strK.equals(nk0Var.b)) {
                    int i3 = ulf0.c;
                    int i4 = (int) (j >> 32);
                    int length2 = strK.length();
                    if (i4 > length2) {
                        i4 = length2;
                    }
                    int i5 = (int) (j & 4294967295L);
                    int length3 = strK.length();
                    if (i5 > length3) {
                        i5 = length3;
                    }
                    ijf0VarB = ijf0.b(ijf0VarB, strK, vlf0.a(i4, i5), 4);
                }
                function1.invoke(ijf0VarB);
                break;
        }
        return Unit.a;
    }
}
