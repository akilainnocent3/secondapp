package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ilc0 {
    public final ykc0 a;
    public final fqo b;
    public final wwd0 c;
    public final wwd0 d;
    public final wwd0 e;
    public final wwd0 f;
    public final wwd0 g;
    public SportyLegendsSettlementInput h;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[glc0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                glc0 glc0Var = glc0.MUTED;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[p7v.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                p7v p7vVar = p7v.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr2;
            int[] iArr3 = new int[v6v.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                v6v v6vVar = v6v.a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ilc0(ykc0 ykc0Var, cmo cmoVar) {
        ResourceUiText resourceUiText;
        ykc0Var.getClass();
        this.a = ykc0Var;
        fqo.a.b bVar = new fqo.a.b(cmoVar.b("sr:sport:3"));
        Integer numC = cmoVar.c("sr:sport:3");
        if (numC != null) {
            int iIntValue = numC.intValue();
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(iIntValue);
        } else {
            resourceUiText = null;
        }
        fqo fqoVar = new fqo(bVar, resourceUiText);
        this.b = fqoVar;
        this.c = xwd0.a(clc0.h);
        this.d = xwd0.a(n1a0.c);
        this.e = xwd0.a(hlc0.d);
        slc0 slc0Var = slc0.f;
        hlc0 hlc0Var = slc0Var.b;
        clc0 clc0Var = slc0Var.c;
        qcn<vkc0> qcnVar = slc0Var.d;
        wlc0 wlc0Var = slc0Var.e;
        hlc0Var.getClass();
        clc0Var.getClass();
        qcnVar.getClass();
        this.f = xwd0.a(new slc0(fqoVar, hlc0Var, clc0Var, qcnVar, wlc0Var));
        this.g = xwd0.a(null);
    }

    public final ulc0 a(List<? extends ulc0> list, ulc0 ulc0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.a.c((ulc0) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            list = arrayList;
        }
        if (ulc0Var == null || list.size() <= 1) {
            return (ulc0) CollectionsKt.T(kotlin.collections.a.d(list));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.g((ulc0) obj2, ulc0Var)) {
                arrayList2.add(obj2);
            }
        }
        return !arrayList2.isEmpty() ? (ulc0) CollectionsKt.T(kotlin.collections.a.d(arrayList2)) : (ulc0) CollectionsKt.T(kotlin.collections.a.d(list));
    }

    public final ArrayList b(String str, boolean z) {
        ulc0 ulc0VarA;
        ulc0 ulc0VarA2;
        ulc0 ulc0VarA3;
        ArrayList arrayList = new ArrayList();
        ulc0 ulc0Var = null;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 'A') {
                if (cCharAt != 'B') {
                    ulc0VarA3 = null;
                } else if (z) {
                    ulc0.a.getClass();
                    ulc0VarA3 = a(ulc0.a.e, ulc0Var);
                } else {
                    if (z) {
                        uhc.a();
                        return null;
                    }
                    ulc0.a.getClass();
                    ulc0VarA3 = a(ulc0.a.i, ulc0Var);
                }
            } else if (z) {
                ulc0.a.getClass();
                ulc0VarA3 = a(ulc0.a.d, ulc0Var);
            } else {
                if (z) {
                    uhc.a();
                    return null;
                }
                ulc0.a.getClass();
                ulc0VarA3 = a(ulc0.a.h, ulc0Var);
            }
            if (ulc0VarA3 != null) {
                arrayList.add(ulc0VarA3);
                ulc0Var = ulc0VarA3;
            }
        }
        boolean zN = StringsKt.N(str, 'A');
        boolean zN2 = StringsKt.N(str, 'B');
        if (!zN) {
            if (z) {
                ulc0.a.getClass();
                ulc0VarA2 = a(ulc0.a.f, ulc0Var);
            } else {
                if (z) {
                    uhc.a();
                    return null;
                }
                ulc0.a.getClass();
                ulc0VarA2 = a(ulc0.a.j, ulc0Var);
            }
            ulc0Var = ulc0VarA2;
            arrayList.add(ulc0Var);
        }
        if (zN2) {
            return arrayList;
        }
        if (z) {
            ulc0.a.getClass();
            ulc0VarA = a(ulc0.a.g, ulc0Var);
        } else {
            if (z) {
                uhc.a();
                return null;
            }
            ulc0.a.getClass();
            ulc0VarA = a(ulc0.a.k, ulc0Var);
        }
        arrayList.add(ulc0VarA);
        return arrayList;
    }
}
