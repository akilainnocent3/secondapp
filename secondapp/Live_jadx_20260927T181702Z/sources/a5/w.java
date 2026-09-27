package a5;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class w extends IOException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @x4.m1
    @Deprecated
    public static final int f3807c = 2008;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3808b;

    @x4.m1
    public w(int i10) {
        this.f3808b = i10;
    }

    @x4.m1
    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof w) && ((w) cause).f3808b == 2008) {
                return true;
            }
        }
        return false;
    }

    @x4.m1
    public w(@Nullable Throwable th2, int i10) {
        super(th2);
        this.f3808b = i10;
    }

    @x4.m1
    public w(@Nullable String str, int i10) {
        super(str);
        this.f3808b = i10;
    }

    @x4.m1
    public w(@Nullable String str, @Nullable Throwable th2, int i10) {
        super(str, th2);
        this.f3808b = i10;
    }
}
