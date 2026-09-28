package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class pqk0 {
    public final HashMap a = new HashMap();
    public final ftk0 b = new ftk0();

    public pqk0() {
        gqk0 gqk0Var = new gqk0();
        ktk0 ktk0Var = ktk0.BITWISE_AND;
        ArrayList arrayList = gqk0Var.a;
        arrayList.add(ktk0Var);
        arrayList.add(ktk0.BITWISE_LEFT_SHIFT);
        arrayList.add(ktk0.BITWISE_NOT);
        arrayList.add(ktk0.BITWISE_OR);
        arrayList.add(ktk0.BITWISE_RIGHT_SHIFT);
        arrayList.add(ktk0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        arrayList.add(ktk0.BITWISE_XOR);
        a(gqk0Var);
        tqk0 tqk0Var = new tqk0();
        ktk0 ktk0Var2 = ktk0.EQUALS;
        ArrayList arrayList2 = tqk0Var.a;
        arrayList2.add(ktk0Var2);
        arrayList2.add(ktk0.GREATER_THAN);
        arrayList2.add(ktk0.GREATER_THAN_EQUALS);
        arrayList2.add(ktk0.IDENTITY_EQUALS);
        arrayList2.add(ktk0.IDENTITY_NOT_EQUALS);
        arrayList2.add(ktk0.LESS_THAN);
        arrayList2.add(ktk0.LESS_THAN_EQUALS);
        arrayList2.add(ktk0.NOT_EQUALS);
        a(tqk0Var);
        xqk0 xqk0Var = new xqk0();
        ktk0 ktk0Var3 = ktk0.APPLY;
        ArrayList arrayList3 = xqk0Var.a;
        arrayList3.add(ktk0Var3);
        arrayList3.add(ktk0.BLOCK);
        arrayList3.add(ktk0.BREAK);
        arrayList3.add(ktk0.CASE);
        arrayList3.add(ktk0.DEFAULT);
        arrayList3.add(ktk0.CONTINUE);
        arrayList3.add(ktk0.DEFINE_FUNCTION);
        arrayList3.add(ktk0.FN);
        arrayList3.add(ktk0.IF);
        arrayList3.add(ktk0.QUOTE);
        arrayList3.add(ktk0.RETURN);
        arrayList3.add(ktk0.SWITCH);
        arrayList3.add(ktk0.v0);
        a(xqk0Var);
        hsk0 hsk0Var = new hsk0();
        ktk0 ktk0Var4 = ktk0.AND;
        ArrayList arrayList4 = hsk0Var.a;
        arrayList4.add(ktk0Var4);
        arrayList4.add(ktk0.NOT);
        arrayList4.add(ktk0.OR);
        a(hsk0Var);
        ysk0 ysk0Var = new ysk0();
        ktk0 ktk0Var5 = ktk0.FOR_IN;
        ArrayList arrayList5 = ysk0Var.a;
        arrayList5.add(ktk0Var5);
        arrayList5.add(ktk0.FOR_IN_CONST);
        arrayList5.add(ktk0.FOR_IN_LET);
        arrayList5.add(ktk0.FOR_LET);
        arrayList5.add(ktk0.FOR_OF);
        arrayList5.add(ktk0.FOR_OF_CONST);
        arrayList5.add(ktk0.FOR_OF_LET);
        arrayList5.add(ktk0.WHILE);
        a(ysk0Var);
        ctk0 ctk0Var = new ctk0();
        ktk0 ktk0Var6 = ktk0.ADD;
        ArrayList arrayList6 = ctk0Var.a;
        arrayList6.add(ktk0Var6);
        arrayList6.add(ktk0.DIVIDE);
        arrayList6.add(ktk0.MODULUS);
        arrayList6.add(ktk0.MULTIPLY);
        arrayList6.add(ktk0.NEGATE);
        arrayList6.add(ktk0.POST_DECREMENT);
        arrayList6.add(ktk0.POST_INCREMENT);
        arrayList6.add(ktk0.PRE_DECREMENT);
        arrayList6.add(ktk0.PRE_INCREMENT);
        arrayList6.add(ktk0.SUBTRACT);
        a(ctk0Var);
        itk0 itk0Var = new itk0();
        ktk0 ktk0Var7 = ktk0.ASSIGN;
        ArrayList arrayList7 = itk0Var.a;
        arrayList7.add(ktk0Var7);
        arrayList7.add(ktk0.CONST);
        arrayList7.add(ktk0.CREATE_ARRAY);
        arrayList7.add(ktk0.CREATE_OBJECT);
        arrayList7.add(ktk0.EXPRESSION_LIST);
        arrayList7.add(ktk0.GET);
        arrayList7.add(ktk0.GET_INDEX);
        arrayList7.add(ktk0.GET_PROPERTY);
        arrayList7.add(ktk0.NULL);
        arrayList7.add(ktk0.SET_PROPERTY);
        arrayList7.add(ktk0.TYPEOF);
        arrayList7.add(ktk0.UNDEFINED);
        arrayList7.add(ktk0.VAR);
        a(itk0Var);
    }

    public final void a(kqk0 kqk0Var) {
        ArrayList arrayList = kqk0Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.a.put(Integer.valueOf(((ktk0) obj).a).toString(), kqk0Var);
        }
    }

    public final ipk0 b(g3l0 g3l0Var, ipk0 ipk0Var) {
        r5l0.k(g3l0Var);
        if (!(ipk0Var instanceof lpk0)) {
            return ipk0Var;
        }
        lpk0 lpk0Var = (lpk0) ipk0Var;
        ArrayList arrayList = lpk0Var.b;
        String str = lpk0Var.a;
        HashMap map = this.a;
        return (map.containsKey(str) ? (kqk0) map.get(str) : this.b).a(str, g3l0Var, arrayList);
    }
}
