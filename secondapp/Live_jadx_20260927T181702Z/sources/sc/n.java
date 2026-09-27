package sc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class n extends ImageView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f130175d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f130176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f130177c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends AsyncTask<Integer, Integer, k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f130178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f130179b;

        public b(Context context, int i10) {
            this.f130178a = context;
            this.f130179b = i10;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k doInBackground(Integer... numArr) {
            try {
                return k.v(this.f130178a, this.f130179b);
            } catch (o e10) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(this.f130179b), e10.getMessage()));
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(k kVar) {
            n.this.f130176b = kVar;
            n.this.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends AsyncTask<InputStream, Integer, k> {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k doInBackground(InputStream... inputStreamArr) {
            try {
                return k.u(inputStreamArr[0]);
            } catch (o e10) {
                Log.e("SVGImageView", "Parse error loading URI: " + e10.getMessage());
                try {
                    return null;
                } catch (IOException unused) {
                    return null;
                }
            } finally {
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(k kVar) {
            n.this.f130176b = kVar;
            n.this.c();
        }
    }

    static {
        try {
            f130175d = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public n(Context context) {
        super(context);
        this.f130176b = null;
        this.f130177c = new j();
    }

    private void setFromString(String str) {
        try {
            this.f130176b = k.x(str);
            c();
        } catch (o unused) {
            Log.e("SVGImageView", "Could not find SVG at: " + str);
        }
    }

    public final void c() {
        k kVar = this.f130176b;
        if (kVar == null) {
            return;
        }
        Picture pictureL = kVar.L(this.f130177c);
        h();
        setImageDrawable(new PictureDrawable(pictureL));
    }

    public final void d(AttributeSet attributeSet, int i10) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, i.b.f129868a, i10, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(i.b.f129869b);
            if (string != null) {
                this.f130177c.b(string);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i.b.f129870c, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                return;
            }
            String string2 = typedArrayObtainStyledAttributes.getString(i.b.f129870c);
            if (string2 != null) {
                if (f(Uri.parse(string2))) {
                    return;
                }
                if (e(string2)) {
                } else {
                    setFromString(string2);
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean e(String str) {
        try {
            new c().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean f(Uri uri) {
        try {
            new c().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public void g(k kVar, String str) {
        if (kVar == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.f130176b = kVar;
        this.f130177c.b(str);
        c();
    }

    public final void h() {
        if (f130175d == null) {
            return;
        }
        try {
            f130175d.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
        } catch (Exception e10) {
            Log.w("SVGImageView", "Unexpected failure calling setLayerType", e10);
        }
    }

    public void setCSS(String str) {
        this.f130177c.b(str);
        c();
    }

    public void setImageAsset(String str) {
        if (e(str)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + str);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        new b(getContext(), i10).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (f(uri)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + uri);
    }

    public void setSVG(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.f130176b = kVar;
        c();
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f130176b = null;
        this.f130177c = new j();
        d(attributeSet, 0);
    }

    public n(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f130176b = null;
        this.f130177c = new j();
        d(attributeSet, i10);
    }
}
