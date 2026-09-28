package defpackage;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ype0 extends qlr implements Function1<Resources, Boolean> {
    public static final ype0 a = new ype0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Resources resources) {
        Resources resources2 = resources;
        resources2.getClass();
        return Boolean.valueOf((resources2.getConfiguration().uiMode & 48) == 32);
    }
}
