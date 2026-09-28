package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class uqv extends ee80 {
    public final ArrayList a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uqv(String str, ArrayList arrayList) {
        String strA;
        str.getClass();
        if (arrayList.size() == 1) {
            strA = kwi.a(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strA = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        super(strA, null);
        this.a = arrayList;
    }

    public uqv(ArrayList arrayList, String str, uqv uqvVar) {
        super(str, uqvVar);
        this.a = arrayList;
    }
}
