package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mt {
    public static final mjm a = new mjm(a.a);
    public static final mjm b = new mjm(b.a);

    public /* synthetic */ class a extends saj implements Function2<Integer, Integer, Integer> {
        public static final a a = new a(2, wcv.class, "min", "min(II)I", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    public /* synthetic */ class b extends saj implements Function2<Integer, Integer, Integer> {
        public static final b a = new b(2, wcv.class, "max", "max(II)I", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }
}
