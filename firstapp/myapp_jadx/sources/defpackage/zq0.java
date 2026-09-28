package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class zq0 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static zq0 c;
    public jh50 a;

    public class a {
        public final int[] a = {2131230979, 2131230977, 2131230903};
        public final int[] b = {2131230927, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {2131230976, 2131230978, 2131230920, R.drawable.abc_text_cursor_material, 2131230973, 2131230974, 2131230975};
        public final int[] d = {2131230952, R.drawable.abc_cab_background_internal_bg, 2131230951};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i) {
            int iC = nof0.c(context, R.attr.colorControlHighlight);
            int iB = nof0.b(context, R.attr.colorButtonNormal);
            int[] iArr = nof0.b;
            int[] iArr2 = nof0.d;
            int iD = b78.d(iC, i);
            return new ColorStateList(new int[][]{iArr, iArr2, nof0.c, nof0.f}, new int[]{iB, iD, b78.d(iC, i), i});
        }

        public static LayerDrawable c(jh50 jh50Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableD = jh50Var.d(context, R.drawable.abc_star_black_48dp);
            Drawable drawableD2 = jh50Var.d(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableD;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableD2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableD2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = zq0.b;
            }
            drawableMutate.setColorFilter(zq0.c(i, mode));
        }

        public final ColorStateList d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return o0b.b(context, R.color.abc_tint_edittext);
            }
            if (i == 2131230969) {
                return o0b.b(context, R.color.abc_tint_switch_track);
            }
            if (i != R.drawable.abc_switch_thumb_material) {
                if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, nof0.c(context, R.attr.colorButtonNormal));
                }
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, nof0.c(context, R.attr.colorAccent));
                }
                if (i == 2131230964 || i == R.drawable.abc_spinner_textfield_background_material) {
                    return o0b.b(context, R.color.abc_tint_spinner);
                }
                if (a(this.b, i)) {
                    return nof0.d(context, R.attr.colorControlNormal);
                }
                if (a(this.e, i)) {
                    return o0b.b(context, R.color.abc_tint_default);
                }
                if (a(this.f, i)) {
                    return o0b.b(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return o0b.b(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = nof0.d(context, R.attr.colorSwitchThumbNormal);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = nof0.b;
                iArr2[0] = nof0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = nof0.e;
                iArr2[1] = nof0.c(context, R.attr.colorControlActivated);
                iArr[2] = nof0.f;
                iArr2[2] = nof0.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = nof0.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = nof0.e;
                iArr2[1] = nof0.c(context, R.attr.colorControlActivated);
                iArr[2] = nof0.f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized zq0 a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return jh50.e(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            zq0 zq0Var = new zq0();
            c = zq0Var;
            zq0Var.a = jh50.b();
            jh50 jh50Var = c.a;
            a aVar = new a();
            synchronized (jh50Var) {
                jh50Var.e = aVar;
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
