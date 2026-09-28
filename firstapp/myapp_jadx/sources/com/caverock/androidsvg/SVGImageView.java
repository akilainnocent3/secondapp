package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.Resources;
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
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import defpackage.ar60;
import defpackage.dr60;
import defpackage.hb5;
import defpackage.ik30;
import defpackage.yq60;
import defpackage.z750;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class SVGImageView extends ImageView {
    public static final Method c;
    public yq60 a;
    public final z750 b;

    public class a extends AsyncTask<Integer, Integer, yq60> {
        public final Context a;
        public final int b;

        public a(Context context, int i) {
            this.a = context;
            this.b = i;
        }

        @Override // android.os.AsyncTask
        public final yq60 doInBackground(Integer[] numArr) {
            int i = this.b;
            try {
                Resources resources = this.a.getResources();
                dr60 dr60Var = new dr60();
                InputStream inputStreamOpenRawResource = resources.openRawResource(i);
                try {
                    yq60 yq60VarF = dr60Var.f(inputStreamOpenRawResource);
                    try {
                        return yq60VarF;
                    } catch (IOException unused) {
                        return yq60VarF;
                    }
                } finally {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (ar60 e) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(i), e.getMessage()));
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(yq60 yq60Var) {
            SVGImageView sVGImageView = SVGImageView.this;
            sVGImageView.a = yq60Var;
            sVGImageView.a();
        }
    }

    public class b extends AsyncTask<InputStream, Integer, yq60> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public final yq60 doInBackground(InputStream[] inputStreamArr) {
            InputStream[] inputStreamArr2 = inputStreamArr;
            try {
                yq60 yq60VarF = new dr60().f(inputStreamArr2[0]);
                try {
                    return yq60VarF;
                } catch (IOException unused) {
                    return yq60VarF;
                }
            } catch (ar60 e) {
                Log.e("SVGImageView", "Parse error loading URI: " + e.getMessage());
                return null;
            } finally {
                try {
                    inputStreamArr2[0].close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(yq60 yq60Var) {
            SVGImageView sVGImageView = SVGImageView.this;
            sVGImageView.a = yq60Var;
            sVGImageView.a();
        }
    }

    static {
        try {
            c = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = null;
        this.b = new z750();
        b(attributeSet, 0);
    }

    private void setFromString(String str) {
        try {
            this.a = new dr60().f(new ByteArrayInputStream(str.getBytes()));
            a();
        } catch (ar60 unused) {
            Log.e("SVGImageView", "Could not find SVG at: " + str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    public final void a() {
        yq60.o oVar;
        Picture pictureC;
        yq60.o oVar2;
        yq60.a aVar;
        yq60 yq60Var = this.a;
        if (yq60Var == null) {
            return;
        }
        yq60.e0 e0Var = yq60Var.a;
        yq60.a aVar2 = e0Var.o;
        z750 z750Var = this.b;
        if (z750Var == null || (aVar = z750Var.b) == null) {
            yq60.o oVar3 = e0Var.r;
            if (oVar3 != null) {
                yq60.c1 c1Var = oVar3.b;
                yq60.c1 c1Var2 = yq60.c1.e;
                if (c1Var != c1Var2 && (oVar2 = e0Var.s) != null && oVar2.b != c1Var2) {
                    pictureC = yq60Var.c((int) Math.ceil(oVar3.a()), (int) Math.ceil(yq60Var.a.s.a()), z750Var);
                } else if (oVar3 != null || aVar2 == null) {
                    oVar = e0Var.s;
                    if (oVar != null || aVar2 == null) {
                        pictureC = yq60Var.c(512, 512, z750Var);
                    } else {
                        float fA = oVar.a();
                        pictureC = yq60Var.c((int) Math.ceil((aVar2.c * fA) / aVar2.d), (int) Math.ceil(fA), z750Var);
                    }
                } else {
                    float fA2 = oVar3.a();
                    pictureC = yq60Var.c((int) Math.ceil(fA2), (int) Math.ceil((aVar2.d * fA2) / aVar2.c), z750Var);
                }
            } else if (oVar3 != null) {
                oVar = e0Var.s;
                if (oVar != null) {
                    pictureC = yq60Var.c(512, 512, z750Var);
                } else {
                    pictureC = yq60Var.c(512, 512, z750Var);
                }
            } else {
                oVar = e0Var.s;
                if (oVar != null) {
                    pictureC = yq60Var.c(512, 512, z750Var);
                } else {
                    pictureC = yq60Var.c(512, 512, z750Var);
                }
            }
        } else {
            pictureC = yq60Var.c((int) Math.ceil(aVar.a()), (int) Math.ceil(z750Var.b.b()), z750Var);
        }
        Method method = c;
        if (method != null) {
            try {
                method.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
            } catch (Exception e) {
                Log.w("SVGImageView", "Unexpected failure calling setLayerType", e);
            }
        }
        setImageDrawable(new PictureDrawable(pictureC));
    }

    public final void b(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, ik30.a, i, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                this.b.a(string);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                return;
            }
            String string2 = typedArrayObtainStyledAttributes.getString(1);
            if (string2 != null) {
                if (d(Uri.parse(string2))) {
                    return;
                }
                if (c(string2)) {
                } else {
                    setFromString(string2);
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean c(String str) {
        try {
            new b().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean d(Uri uri) {
        try {
            new b().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public void setCSS(String str) {
        this.b.a(str);
        a();
    }

    public void setImageAsset(String str) {
        if (c(str)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + str);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        new a(getContext(), i).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (d(uri)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + uri);
    }

    public void setSVG(yq60 yq60Var, String str) {
        if (yq60Var == null) {
            hb5.a(LGxrN.OTrhqMfRecYCDTx);
            return;
        }
        this.a = yq60Var;
        this.b.a(str);
        a();
    }

    public SVGImageView(Context context) {
        super(context);
        this.a = null;
        this.b = new z750();
    }

    public void setSVG(yq60 yq60Var) {
        if (yq60Var != null) {
            this.a = yq60Var;
            a();
        } else {
            hb5.a("Null value passed to setSVG()");
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
        this.b = new z750();
        b(attributeSet, i);
    }
}
