package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.sportybet.android.gp.tz.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zch0 {
    public static int a(Context context, int i) {
        return b(context.getResources(), i);
    }

    public static int b(Resources resources, int i) {
        return (int) ((i * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static int c(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        int i = 80;
        while (byteArrayOutputStream.toByteArray().length / 1024 > 500) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            i -= 10;
        }
        return i;
    }

    public static RelativeLayout.LayoutParams d(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i == 0) {
            layoutParams.addRule(14, -1);
        } else if (i < 0) {
            layoutParams.addRule(11, -1);
            layoutParams.rightMargin = -i;
        } else {
            layoutParams.leftMargin = i;
        }
        if (i2 == 0) {
            layoutParams.addRule(15, -1);
            return layoutParams;
        }
        if (i2 >= 0) {
            layoutParams.topMargin = i2;
            return layoutParams;
        }
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = -i2;
        return layoutParams;
    }

    public static GradientDrawable e(int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = i3;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        gradientDrawable.setColor(0);
        if (i2 > 0) {
            gradientDrawable.setStroke(i2, i);
        }
        return gradientDrawable;
    }

    public static int f(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated(since = "Use OutcomeButton.setImage()")
    public static SpannableString g(Context context, Boolean bool) {
        rv6 rv6Var = new rv6(context, bool.booleanValue() ? R.drawable.spr_ic_prematch_lock : R.drawable.spr_ic_live_lock);
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(rv6Var, 0, spannableString.length(), 33);
        return spannableString;
    }

    @Deprecated(since = "Use OutcomeButton.setImage()")
    public static SpannableString h(Context context) {
        rv6 rv6Var = new rv6(context, R.drawable.spr_ic_prematch_lock);
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(rv6Var, 0, spannableString.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Bitmap i(Context context, Uri uri, int i, boolean z) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    int i2 = 1;
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    int i3 = options.outWidth;
                    int i4 = options.outHeight;
                    if (i3 <= i4 && !z) {
                        i3 = i4;
                    }
                    if (i3 > i) {
                        i2 = 2;
                        while (i3 / i2 > i) {
                            i2 *= 2;
                        }
                    }
                    inputStreamOpenInputStream.close();
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = i2;
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                            return bitmapDecodeStream;
                        } catch (IOException e) {
                            itf0.a aVar = itf0.a;
                            aVar.q("UiUtils");
                            aVar.e(e);
                        }
                    }
                    return bitmapDecodeStream;
                } catch (Exception e2) {
                    e = e2;
                    itf0.a aVar2 = itf0.a;
                    aVar2.q("UiUtils");
                    aVar2.e(e);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e3) {
                            itf0.a aVar3 = itf0.a;
                            aVar3.q("UiUtils");
                            aVar3.e(e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        itf0.a aVar4 = itf0.a;
                        aVar4.q("UiUtils");
                        aVar4.e(e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static SpannableStringBuilder j(CharSequence charSequence, int i, int i2, ClickableSpan clickableSpan) {
        StringBuffer stringBuffer = new StringBuffer();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = Pattern.compile("\\^.*?\\^").matcher(charSequence);
        while (matcher.find()) {
            stringBuffer.setLength(0);
            String strGroup = matcher.group();
            String strSubstring = strGroup.substring(1, strGroup.length() - 1);
            matcher.appendReplacement(stringBuffer, strSubstring);
            spannableStringBuilder.append((CharSequence) stringBuffer.toString());
            int length = spannableStringBuilder.length() - strSubstring.length();
            if (clickableSpan != null) {
                spannableStringBuilder.setSpan(clickableSpan, length, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(i2, true), length, spannableStringBuilder.length(), 33);
        }
        stringBuffer.setLength(0);
        matcher.appendTail(stringBuffer);
        spannableStringBuilder.append((CharSequence) stringBuffer.toString());
        return spannableStringBuilder;
    }

    public static void k(Context context, ImageView imageView, int i) {
        Drawable drawable = context.getDrawable(R.drawable.spr_rotate_clock);
        if (drawable == null) {
            return;
        }
        drawable.setTint(i);
        imageView.setImageDrawable(drawable);
        Drawable drawable2 = context.getDrawable(R.drawable.spr_rotate_clock);
        if (drawable2 == null) {
            return;
        }
        bdf.a(drawable2).setTintList(null);
    }
}
