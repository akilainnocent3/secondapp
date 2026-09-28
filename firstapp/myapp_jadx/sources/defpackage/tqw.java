package defpackage;

import com.esotericsoftware.spine.android.b;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tqw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tqw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b bVar = (b) ((ytw) obj2).getValue();
                if (bVar == null) {
                    return Unit.a;
                }
                if (((Boolean) ((x5a0) trw.a).getValue()).booleanValue()) {
                    str = "SB_Christmas";
                } else if (((Boolean) ((x5a0) trw.b).getValue()).booleanValue()) {
                    str = "SB_Fugu";
                } else if (trw.g() && trw.g()) {
                    String lowerCase = e6a.a().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    int iHashCode = lowerCase.hashCode();
                    if (iHashCode != 3152) {
                        if (iHashCode != 3297) {
                            if (iHashCode != 3499) {
                                if (iHashCode != 3879) {
                                    if (iHashCode == 104431 && lowerCase.equals("int")) {
                                        str = "SB_WC_Brazil";
                                    }
                                } else if (lowerCase.equals("za")) {
                                    str = "SB_WC_southAfrica";
                                }
                                str = "SB_WC_NG_TZ";
                            } else if (lowerCase.equals("mx")) {
                                str = "SB_WC_Mexico";
                            } else {
                                str = "SB_WC_NG_TZ";
                            }
                        } else if (lowerCase.equals("gh")) {
                            str = "SB_WC_Ghana";
                        } else {
                            str = "SB_WC_NG_TZ";
                        }
                    } else if (lowerCase.equals("br")) {
                        str = "SB_WC_Brazil";
                    } else {
                        str = "SB_WC_NG_TZ";
                    }
                } else {
                    str = "SB";
                }
                bVar.b().c(str);
                bVar.b().d();
                return Unit.a;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ((Function1) obj2).invoke(new pq90.d(str2));
                return Unit.a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                return Boolean.valueOf((((Set) obj2).contains(entry.getKey()) || Intrinsics.g(entry.getValue(), wkh0.c.C1249c.a)) ? false : true);
        }
    }
}
