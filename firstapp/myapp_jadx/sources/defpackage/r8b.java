package defpackage;

import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r8b implements Function0 {
    public final /* synthetic */ dq40 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ u8b d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ r8b(dq40 dq40Var, Function0 function0, Function0 function1, q8b q8bVar, Function0 function2) {
        this.a = dq40Var;
        this.b = function0;
        this.c = function1;
        this.d = q8bVar;
        this.e = function2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = (String) this.a.a;
        int iHashCode = str.hashCode();
        Function0 function0 = this.c;
        u8b u8bVar = this.d;
        switch (iHashCode) {
            case -1544869189:
                if (str.equals("Refresh")) {
                    function0.invoke();
                    ((x5a0) u8bVar.b).setValue(Boolean.FALSE);
                }
                break;
            case -1532807697:
                if (str.equals("Restart")) {
                    function0.invoke();
                    ((x5a0) u8bVar.b).setValue(Boolean.FALSE);
                }
                break;
            case 2174270:
                if (str.equals("Exit")) {
                    this.b.invoke();
                }
                break;
            case 73596745:
                if (str.equals("Login")) {
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                }
                break;
            case 508633153:
                if (str.equals("Add Money")) {
                    SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                }
                break;
            case 1990705797:
                if (str.equals("TryAgain")) {
                    this.e.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
