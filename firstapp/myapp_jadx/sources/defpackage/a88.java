package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a88 {
    public final String a;
    public final ArrayList b;

    public a88(String str, List<Integer> list) {
        this.a = str;
        this.b = new ArrayList(new LinkedHashSet(list));
    }

    public final String a(Context context) {
        String strConcat;
        String strValueOf;
        int i = 0;
        switch (this.a) {
            case "cutbet":
            case "multiple":
            case "flexible":
                strConcat = sn5.b(context, R.string.component_betslip__multiple, new Object[0]).concat(" ");
                break;
            case "single":
                strConcat = sn5.b(context, R.string.component_betslip__single, new Object[0]).concat(" ");
                break;
            case "system":
                strConcat = sn5.b(context, R.string.component_betslip__system, new Object[0]).concat(" ");
                break;
            default:
                strConcat = "";
                break;
        }
        j7g j7gVar = new j7g();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Integer num = (Integer) obj;
            if (i > 0 && i % 3 == 0) {
                j7gVar.a("\n");
            }
            if (num.intValue() >= 10) {
                strValueOf = String.valueOf(num);
            } else {
                strValueOf = "0" + num;
            }
            j7gVar.a(strValueOf);
            j7gVar.a(", ");
            i++;
        }
        if (j7gVar.length() > 0) {
            j7gVar.delete(j7gVar.length() - 2, j7gVar.length());
        }
        return strConcat + ((Object) j7gVar);
    }

    public final String toString() {
        return this.a;
    }
}
