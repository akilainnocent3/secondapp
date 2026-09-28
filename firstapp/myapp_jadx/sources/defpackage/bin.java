package defpackage;

import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bin implements r8i0.c {
    public final n8i0<?>[] a;

    public bin(n8i0<?>... n8i0VarArr) {
        this.a = n8i0VarArr;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // r8i0.c
    public final j8i0 a(Class cls, dsw dswVar) {
        n8i0 n8i0Var;
        j8i0 j8i0Var;
        Function1<cyb, T> function1;
        dq7 dq7VarA = jq40.a(cls);
        n8i0<?>[] n8i0VarArr = this.a;
        n8i0[] n8i0VarArr2 = (n8i0[]) Arrays.copyOf(n8i0VarArr, n8i0VarArr.length);
        int length = n8i0VarArr2.length;
        int i = 0;
        while (true) {
            if (i < length) {
                n8i0Var = n8i0VarArr2[i];
                if (n8i0Var.a.equals(dq7VarA)) {
                    break;
                }
                i++;
            } else {
                n8i0Var = null;
                break;
            }
        }
        if (n8i0Var != null && (function1 = n8i0Var.b) != 0) {
            j8i0Var = (j8i0) function1.invoke(dswVar);
        } else {
            j8i0Var = null;
        }
        if (j8i0Var != null) {
            return j8i0Var;
        }
        r2z.a(dq7VarA.i(), dLRYz.niFCJXNiZxKJhr);
        return null;
    }
}
