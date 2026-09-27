package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f31425e = "AssetPathFetcher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager f31427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f31428d;

    public b(AssetManager assetManager, String str) {
        this.f31427c = assetManager;
        this.f31426b = str;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public tb.a b() {
        return tb.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void c(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super T> aVar) {
        try {
            T tE = e(this.f31427c, this.f31426b);
            this.f31428d = tE;
            aVar.d(tE);
        } catch (IOException e10) {
            if (Log.isLoggable(f31425e, 3)) {
                Log.d(f31425e, "Failed to load data from asset manager", e10);
            }
            aVar.e(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        T t10 = this.f31428d;
        if (t10 == null) {
            return;
        }
        try {
            d(t10);
        } catch (IOException unused) {
        }
    }

    public abstract void d(T t10) throws IOException;

    public abstract T e(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
