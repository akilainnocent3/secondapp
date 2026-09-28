package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zxo {
    public static final mjm a = new mjm(b.a);
    public static final t2i0 b = new t2i0(a.a);
    public static final qyd0 c = new qyd0(new b8f());
    public static final qyd0 d = new qyd0(new bia(1));

    public /* synthetic */ class a extends saj implements Function2<Integer, Integer, Integer> {
        public static final a a = new a(2, wcv.class, "min", "min(II)I", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    public /* synthetic */ class b extends saj implements Function2<Integer, Integer, Integer> {
        public static final b a = new b(2, wcv.class, "min", "min(II)I", 1);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }
}
