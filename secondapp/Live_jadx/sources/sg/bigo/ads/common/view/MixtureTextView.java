package sg.bigo.ads.common.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public class MixtureTextView extends RelativeLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int[] f133487s = {R.attr.textSize, R.attr.textColor, R.attr.text};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Layout f133488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f133489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f133490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f133491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f133492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f133493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<List<Rect>> f133494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Integer> f133495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Layout> f133496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Integer> f133497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HashSet<Integer> f133498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f133499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f133500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f133501n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f133502o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f133503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f133504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f133505r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map<Integer, Point> f133506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f133507u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f133508v;

    public interface a {
        void a(UnderlineSpan underlineSpan);
    }

    public MixtureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f133488a = null;
        this.f133490c = -9601400;
        this.f133494g = new ArrayList();
        this.f133495h = null;
        this.f133496i = new ArrayList();
        this.f133497j = new ArrayList();
        this.f133498k = new HashSet<>();
        this.f133506t = new HashMap();
        this.f133508v = true;
        this.f133491d = e.b(getContext(), 14);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f133487s);
        this.f133491d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f133491d);
        this.f133490c = typedArrayObtainStyledAttributes.getColor(1, this.f133490c);
        this.f133492e = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f133493f = textPaint;
        textPaint.setDither(true);
        this.f133493f.setAntiAlias(true);
        this.f133493f.setColor(this.f133490c);
        if (TextUtils.isEmpty(this.f133492e)) {
            return;
        }
        this.f133504q = true;
    }

    private static CharSequence a(CharSequence charSequence, int i10, int i11) {
        if (q.a(charSequence)) {
            return null;
        }
        if (!(charSequence instanceof SpannableString)) {
            if (charSequence instanceof String) {
                return ((String) charSequence).substring(i10, i11);
            }
            return null;
        }
        SpannableString spannableString = (SpannableString) charSequence;
        SpannableString spannableString2 = new SpannableString(TextUtils.substring(spannableString, i10, i11));
        Object[] spans = spannableString.getSpans(i10, i11, Object.class);
        for (int length = spans.length - 1; length >= 0; length--) {
            Object obj = spans[length];
            int spanStart = spannableString.getSpanStart(obj) - i10;
            int spanEnd = spannableString.getSpanEnd(obj) - i10;
            try {
                int length2 = spannableString2.length();
                if (spanEnd >= spanStart && spanStart <= length2 && spanEnd <= length2 && spanStart >= 0) {
                    spannableString2.setSpan(obj, spanStart, spanEnd, 33);
                }
            } catch (Exception unused) {
            }
        }
        return spannableString2;
    }

    private static void b(Rect rect, List<Rect> list, int i10, int i11, int i12) {
        if (rect.left > i12) {
            list.add(new Rect(i12, i10, rect.left, i11));
        }
    }

    private void getAllYCors() {
        int i10 = this.f133489b;
        HashSet<Integer> hashSet = this.f133498k;
        hashSet.clear();
        this.f133506t.clear();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                childAt.getTop();
                int top = (((childAt.getTop() - getPaddingTop()) / i10) * i10) + getPaddingTop();
                hashSet.add(Integer.valueOf(top));
                int bottom = childAt.getBottom() - getPaddingTop();
                if (bottom % i10 != 0) {
                    bottom = ((bottom / i10) + 1) * i10;
                }
                int paddingTop = bottom + getPaddingTop();
                hashSet.add(Integer.valueOf(paddingTop));
                this.f133506t.put(Integer.valueOf(i11), new Point(top, paddingTop));
            }
        }
        hashSet.add(Integer.valueOf(getPaddingTop()));
        hashSet.add(Integer.valueOf(this.f133501n == 1073741824 ? getHeight() : Integer.MAX_VALUE));
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f133495h = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        this.f133499l = getPaddingBottom() + getPaddingTop();
        int i12 = this.f133489b;
        List<List<Rect>> list = this.f133494g;
        List<Integer> list2 = this.f133495h;
        list.clear();
        if (list2 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = 1;
                if (i14 >= list2.size() - 1) {
                    break;
                }
                int iIntValue = list2.get(i14).intValue();
                i14++;
                int iIntValue2 = list2.get(i14).intValue();
                ArrayList arrayList = new ArrayList();
                List<Rect> listA = a(iIntValue, iIntValue2);
                int size = listA.size();
                if (size == 0) {
                    arrayList.add(new Rect(paddingLeft, iIntValue, width, iIntValue2));
                } else if (size != 1) {
                    b(listA.get(i13), arrayList, iIntValue, iIntValue2, paddingLeft);
                    int i16 = i13;
                    while (i16 < listA.size() - i15) {
                        Rect rect = listA.get(i16);
                        i16++;
                        Rect rect2 = listA.get(i16);
                        int i17 = i15;
                        if (rect.right < rect2.left) {
                            arrayList.add(new Rect(rect.right, iIntValue, rect2.left, iIntValue2));
                        }
                        i15 = i17;
                    }
                    a(listA.get(listA.size() - 1), arrayList, iIntValue, iIntValue2, width);
                } else {
                    Rect rect3 = listA.get(i13);
                    b(rect3, arrayList, iIntValue, iIntValue2, paddingLeft);
                    a(rect3, arrayList, iIntValue, iIntValue2, width);
                }
                list.add(arrayList);
                i13 = 0;
            }
            int i18 = 1;
            ArrayList arrayList2 = new ArrayList(list);
            int size2 = list.size();
            int i19 = 0;
            int i20 = 0;
            while (i20 < size2) {
                List<Rect> list3 = list.get(i20);
                int i21 = i18;
                if (list3.size() > i21) {
                    int i22 = i19 + i20;
                    arrayList2.remove(list3);
                    i19--;
                    Rect rect4 = list3.get(0);
                    int iHeight = rect4.height() / i12;
                    this.f133499l -= ((list3.size() - i21) * iHeight) * i12;
                    int i23 = i22;
                    int i24 = 0;
                    while (i24 < iHeight) {
                        int i25 = i23;
                        int i26 = 0;
                        while (i26 < list3.size()) {
                            i19++;
                            int i27 = i12;
                            int i28 = i27 * i24;
                            arrayList2.add(i25, Arrays.asList(new Rect(list3.get(i26).left, rect4.top + i28, list3.get(i26).right, rect4.top + i28 + i27)));
                            i26++;
                            i25++;
                            i12 = i27;
                            size2 = size2;
                            list = list;
                        }
                        i24++;
                        i23 = i25;
                        i12 = i12;
                    }
                    i10 = i12;
                    i11 = 1;
                } else {
                    i10 = i12;
                    i11 = i21;
                }
                i20++;
                i18 = i11;
                i12 = i10;
                size2 = size2;
                list = list;
            }
            this.f133494g = arrayList2;
        }
        if (a(null)) {
            return;
        }
        a(canvas);
        super.dispatchDraw(canvas);
    }

    public CharSequence getText() {
        return this.f133492e;
    }

    public int getTextColor() {
        return this.f133490c;
    }

    public int getTextSize() {
        return this.f133491d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int offsetForHorizontal;
        a aVar;
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && q.b(this.f133492e)) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (this.f133496i.isEmpty() || this.f133497j.isEmpty()) {
                offsetForHorizontal = 0;
            } else {
                offsetForHorizontal = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < this.f133496i.size(); i11++) {
                    Layout layout = this.f133496i.get(i11);
                    int iIntValue = this.f133497j.get(i11).intValue();
                    if (layout != null) {
                        int lineForVertical = layout.getLineForVertical(y10);
                        if (lineForVertical + 1 <= iIntValue) {
                            offsetForHorizontal += layout.getOffsetForHorizontal(Math.min(lineForVertical, layout.getLineCount() - 1), x10);
                            break;
                        }
                        i10 += iIntValue;
                        y10 -= this.f133489b * i10;
                        offsetForHorizontal += layout.getLineEnd(iIntValue - 1);
                    }
                }
            }
            if (offsetForHorizontal < this.f133492e.length()) {
                CharSequence charSequence = this.f133492e;
                if (charSequence instanceof SpannableString) {
                    UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) ((SpannableString) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, UnderlineSpan.class);
                    if (underlineSpanArr.length > 0 && (aVar = this.f133507u) != null) {
                        aVar.a(underlineSpanArr[0]);
                        return true;
                    }
                }
            }
        }
        return zOnInterceptTouchEvent;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f133508v) {
            this.f133501n = View.MeasureSpec.getMode(this.f133500m);
            this.f133508v = false;
            this.f133505r = getMeasuredHeight();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f133504q) {
            getAllYCors();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f133504q) {
            super.onMeasure(i10, i11);
            return;
        }
        this.f133500m = i11;
        this.f133493f.setTextSize(this.f133491d);
        StaticLayout staticLayout = new StaticLayout("测量行高", this.f133493f, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f133488a = staticLayout;
        this.f133489b = staticLayout.getLineBottom(0) - this.f133488a.getLineTop(0);
        if (this.f133503p) {
            super.onMeasure(i10, this.f133502o);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setClickListener(a aVar) {
        this.f133507u = aVar;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f133504q = false;
            requestLayout();
        } else {
            this.f133504q = true;
            this.f133492e = charSequence;
            requestLayout();
            invalidate();
        }
    }

    public void setTextColor(int i10) {
        this.f133493f.setColor(i10);
        this.f133490c = i10;
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f133491d = i10;
        this.f133493f.setTextSize(i10);
        requestLayout();
        invalidate();
    }

    private List<Rect> a(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            Point point = this.f133506t.get(Integer.valueOf(i12));
            int i13 = point.x;
            int i14 = point.y;
            if (i13 <= i10 && i14 >= i11) {
                arrayList.add(new Rect(childAt.getLeft(), i10, childAt.getRight(), i11));
            }
        }
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: sg.bigo.ads.common.view.MixtureTextView.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Rect rect, Rect rect2) {
                return rect.left > rect2.left ? 1 : -1;
            }
        });
        if (arrayList.size() < 2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Rect rect = (Rect) arrayList.get(0);
        Rect rect2 = (Rect) arrayList.get(1);
        for (int i15 = 1; i15 < arrayList.size(); i15++) {
            if (!Rect.intersects(rect, rect2)) {
                if (arrayList2.size() - i15 < 2) {
                    break;
                }
                Rect rect3 = rect2;
                rect2 = (Rect) arrayList.get(i15 + 1);
                rect = rect3;
            } else {
                int iMin = Math.min(rect.left, rect2.left);
                int iMax = Math.max(rect.right, rect2.right);
                arrayList2.remove(rect);
                arrayList2.remove(rect2);
                arrayList2.add(new Rect(iMin, i10, iMax, i11));
                if (arrayList2.size() < 2) {
                    break;
                }
                rect = (Rect) arrayList.get(0);
                rect2 = (Rect) arrayList.get(1);
            }
        }
        return arrayList2;
    }

    private static void a(Rect rect, List<Rect> list, int i10, int i11, int i12) {
        if (rect.right < i12) {
            list.add(new Rect(rect.right, i10, i12, i11));
        }
    }

    private boolean a(Canvas canvas) {
        boolean z10 = canvas == null;
        int i10 = this.f133489b;
        List<List<Rect>> list = this.f133494g;
        CharSequence charSequence = this.f133492e;
        int length = charSequence != null ? charSequence.length() : 0;
        int lineEnd = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Rect rect = list.get(i12).get(0);
            int iWidth = rect.width();
            int iHeight = rect.height();
            CharSequence charSequenceA = a(this.f133492e, lineEnd, length);
            StaticLayout staticLayout = (q.a(charSequenceA) || this.f133493f == null) ? null : new StaticLayout(charSequenceA, this.f133493f, iWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f133488a = staticLayout;
            if (staticLayout != null) {
                int iMin = Math.min(staticLayout.getLineCount(), iHeight / i10);
                if (!z10) {
                    canvas.save();
                    canvas.translate(rect.left, rect.top);
                    canvas.clipRect(0, 0, rect.width(), this.f133488a.getLineBottom(iMin - 1) - this.f133488a.getLineTop(0));
                    this.f133488a.draw(canvas);
                    canvas.restore();
                }
                lineEnd += this.f133488a.getLineEnd(iMin - 1);
                if (canvas != null) {
                    this.f133496i.add(this.f133488a);
                    this.f133497j.add(Integer.valueOf(iMin));
                }
                i11 += iMin;
                if (lineEnd >= length) {
                    break;
                }
            }
        }
        if (z10) {
            int i13 = this.f133499l + (i11 * i10);
            this.f133499l = i13;
            if (i13 > this.f133505r) {
                int height = getHeight();
                int i14 = this.f133499l;
                if (height != i14 && this.f133501n != 1073741824) {
                    this.f133502o = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                    this.f133503p = true;
                    requestLayout();
                    return true;
                }
            }
        }
        return false;
    }
}
