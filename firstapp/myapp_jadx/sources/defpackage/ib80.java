package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ib80 {
    public static final ob80<Boolean> a = new ob80<>("TestTagsAsResourceId", false, b.a);
    public static final ob80<String> b = new ob80<>("AccessibilityClassName", true, a.a);

    public static final class a extends qlr implements Function2<String, String, String> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    public static final class b extends qlr implements Function2<Boolean, Boolean, Boolean> {
        public static final b a = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool;
            bool2.getClass();
            return bool3;
        }
    }
}
