package defpackage;

import com.sportygames.newcms.CMSRes;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class fbx {
    public static final fbx d;
    public static final fbx e;
    public static final /* synthetic */ fbx[] f;
    public static final /* synthetic */ uag i;
    public final String a;
    public final String b;
    public final CMSRes c;

    static {
        shj shjVar = shj.v0;
        fbx fbxVar = new fbx("Day", 0, "UP", "Day", shjVar.k);
        d = fbxVar;
        fbx fbxVar2 = new fbx("NIGHT", 1, "DOWN", "Night", shjVar.l);
        e = fbxVar2;
        fbx[] fbxVarArr = {fbxVar, fbxVar2, new fbx("DAWN", 2, "MIDDLE", "Dawn", shjVar.m)};
        f = fbxVarArr;
        i = new uag(fbxVarArr);
    }

    public fbx(String str, int i2, String str2, String str3, CMSRes cMSRes) {
        super(str, i2);
        this.a = str2;
        this.b = str3;
        this.c = cMSRes;
    }

    public static fbx valueOf(String str) {
        return (fbx) Enum.valueOf(fbx.class, str);
    }

    public static fbx[] values() {
        return (fbx[]) f.clone();
    }
}
