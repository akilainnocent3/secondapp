package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ej implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f54584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54585b;

    public Ej(String location, byte[] imageBytes) {
        kotlin.jvm.internal.m0.p(imageBytes, "imageBytes");
        kotlin.jvm.internal.m0.p(location, "location");
        this.f54584a = imageBytes;
        this.f54585b = location;
    }

    @Override // com.inmobi.media.M0
    public final Object a() {
        byte[] bArr = this.f54584a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        kotlin.jvm.internal.m0.m(bitmapDecodeByteArray);
        return a(bitmapDecodeByteArray);
    }

    public final String a(Bitmap bitmap) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        String str = string + ".jpg";
        File file = new File(this.f54585b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(this.f54585b + to.c.userBaseDel + str)));
        return this.f54585b + to.c.userBaseDel + str;
    }
}
