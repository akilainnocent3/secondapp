package defpackage;

import java.util.Random;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final class vx30 {
    public static Supplier<Random> a() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? p70.a : new ux30();
    }
}
