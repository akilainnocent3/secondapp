package defpackage;

import androidx.compose.runtime.a;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w04 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ w04(j590 j590Var) {
        this.b = j590Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k590 k590Var;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o14.d((d7e0) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                j590 j590Var = (j590) obj3;
                jxo jxoVar = (jxo) obj;
                float fH = kxa.h(((kxa) obj2).a);
                o9f o9fVar = new o9f();
                o9fVar.a(k590.a, fH);
                float f = fH / 2.0f;
                if (((int) (jxoVar.a & 4294967295L)) > f && !j590Var.a) {
                    o9fVar.a(k590.c, f);
                }
                int i2 = (int) (jxoVar.a & 4294967295L);
                if (i2 != 0) {
                    o9fVar.a(k590.b, Math.max(0.0f, fH - i2));
                }
                Unit unit = Unit.a;
                LinkedHashMap linkedHashMap = o9fVar.a;
                bou bouVar = new bou(linkedHashMap);
                int iOrdinal = ((k590) j590Var.e.h.getValue()).ordinal();
                if (iOrdinal == 0) {
                    k590Var = k590.a;
                } else if (iOrdinal == 1) {
                    k590Var = k590.b;
                    if (!linkedHashMap.containsKey(k590Var)) {
                        k590Var = k590.a;
                    }
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    k590Var = k590.c;
                    if (!linkedHashMap.containsKey(k590Var)) {
                        k590Var = k590.b;
                        if (!linkedHashMap.containsKey(k590Var)) {
                            k590Var = k590.a;
                        }
                    }
                }
                return new Pair(bouVar, k590Var);
        }
    }
}
