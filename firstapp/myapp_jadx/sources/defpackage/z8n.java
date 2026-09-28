package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z8n extends l8l {
    public final int a = 1;
    public final kch b = kch.d;

    @Override // defpackage.l8l
    public final kch a() {
        return this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.a;
        if (i == 0) {
            str = "JPEG";
        } else if (i != 1) {
            str = "UNDEFINED(" + i + ')';
        } else {
            str = "JPEG_R";
        }
        return j26.a(sb, str, ')');
    }
}
