package com.sportybet.android.fileprovider;

import com.sportybet.android.gp.tz.R;
import defpackage.hp0;
import defpackage.mkh;
import defpackage.mmc;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/fileprovider/MyFileProvider;", "Lmkh;", "<init>", "()V", "b", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MyFileProvider extends mkh {
    public static final /* synthetic */ int v = 0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/sportybet/android/fileprovider/MyFileProvider$a;", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a {
        File b();
    }

    public static final class b {
        public static File a() {
            return ((a) mmc.a(hp0.A, a.class)).b();
        }
    }

    public MyFileProvider() {
        super(R.xml.provider_paths);
    }
}
