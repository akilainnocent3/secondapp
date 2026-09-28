package com.sportybet.plugin.jackpot.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.protobuf.Reader;
import defpackage.j7g;
import defpackage.sn5;
import defpackage.uf80;
import defpackage.yk10;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class EllipsizingTextView extends AppCompatTextView {
    public static final Pattern G = Pattern.compile("[.,…;:\\s]*$", 32);
    public String A;
    public int B;
    public float C;
    public float D;
    public Pattern E;
    public boolean F;
    public final ArrayList v;
    public boolean w;
    public boolean y;
    public boolean z;

    public interface a {
        void a();
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = new ArrayList();
        this.C = 1.0f;
        this.D = 0.0f;
        super.setEllipsize(null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxLines});
        setMaxLines(typedArrayObtainStyledAttributes.getInt(0, Reader.READ_DONE));
        typedArrayObtainStyledAttributes.recycle();
        setEndPunctuationPattern(G);
    }

    private int getFullyVisibleLinesCount() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) / g("").getLineBottom(0);
    }

    private int getLinesCount() {
        int i = this.B;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int fullyVisibleLinesCount = getFullyVisibleLinesCount();
        if (fullyVisibleLinesCount == -1) {
            return 1;
        }
        return fullyVisibleLinesCount;
    }

    private void setTextWithViewMore(String str) {
        j7g j7gVar = new j7g(str);
        j7gVar.a(" ");
        j7gVar.e(Color.parseColor("#fac111"), sn5.c(this, com.sportybet.android.gp.tz.R.string.common_functions__view_more_low, new Object[0]));
        setText(j7gVar);
    }

    public final StaticLayout g(String str) {
        return new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.C, this.D, false);
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.B;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        int iLastIndexOf;
        if (this.y) {
            boolean z2 = this.F;
            String strA = this.A;
            int i = 0;
            if (z2) {
                if (g(strA + " " + sn5.c(this, com.sportybet.android.gp.tz.R.string.common_functions__view_more_low, new Object[0])).getLineCount() > g(this.A).getLineCount()) {
                    this.A = uf80.a(new StringBuilder(), this.A, "\n");
                }
                this.z = true;
                try {
                    setTextWithViewMore(this.A);
                    this.z = false;
                    this.y = false;
                } catch (Throwable th) {
                    this.z = false;
                    throw th;
                }
            } else {
                StaticLayout staticLayoutG = g(strA);
                int linesCount = getLinesCount();
                if (staticLayoutG.getLineCount() > linesCount) {
                    String strTrim = this.A.substring(0, staticLayoutG.getLineEnd(linesCount - 1)).trim();
                    while (true) {
                        if (g(strTrim + "…").getLineCount() <= linesCount || (iLastIndexOf = strTrim.lastIndexOf(32)) == -1) {
                            break;
                        } else {
                            strTrim = strTrim.substring(0, iLastIndexOf);
                        }
                    }
                    strA = yk10.a(this.E.matcher(strTrim).replaceFirst(""), "…");
                    z = true;
                } else {
                    z = false;
                }
                if (!strA.equals(getText())) {
                    this.z = true;
                    try {
                        setText(strA);
                        this.z = false;
                    } catch (Throwable th2) {
                        this.z = false;
                        throw th2;
                    }
                }
                this.y = false;
                if (z != this.w) {
                    this.w = z;
                    ArrayList arrayList = this.v;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((a) obj).a();
                    }
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.B == Integer.MAX_VALUE) {
            this.y = true;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.z) {
            return;
        }
        this.A = charSequence.toString();
        this.y = true;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setEndPunctuationPattern(Pattern pattern) {
        this.E = pattern;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        this.D = f;
        this.C = f2;
        super.setLineSpacing(f, f2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.B = i;
        this.y = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.B == Integer.MAX_VALUE) {
            this.y = true;
        }
    }

    public void setViewMore(boolean z) {
        this.F = z;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EllipsizingTextView(Context context) {
        this(context, null);
    }
}
