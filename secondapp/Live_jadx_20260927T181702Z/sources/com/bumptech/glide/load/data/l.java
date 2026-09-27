package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f31456e = "LocalUriFetcher";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f31457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f31458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f31459d;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f31458c = contentResolver;
        this.f31457b = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public tb.a b() {
        return tb.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void c(@NonNull com.bumptech.glide.i iVar, @NonNull d.a<? super T> aVar) {
        try {
            T tE = e(this.f31457b, this.f31458c);
            this.f31459d = tE;
            aVar.d(tE);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable(f31456e, 3)) {
                Log.d(f31456e, "Failed to open Uri", e10);
            }
            aVar.e(e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        T t10 = this.f31459d;
        if (t10 != null) {
            try {
                d(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void d(T t10) throws IOException;

    public abstract T e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
