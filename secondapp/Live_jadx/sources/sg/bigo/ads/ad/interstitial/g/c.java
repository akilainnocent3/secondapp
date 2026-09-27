package sg.bigo.ads.ad.interstitial.g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, Integer> f131920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<String, Integer> f131921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<String> f131922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f131923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f131924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f131925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f131926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f131927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f131928i;

    public c(Context context) {
        this(context, (byte) 0);
    }

    private void a() {
        Paint paint;
        int i10;
        if (this.f131924e == 1) {
            this.f131925f.setColor(-1);
            paint = this.f131926g;
            i10 = 872415231;
        } else {
            this.f131925f.setColor(-16777216);
            paint = this.f131926g;
            i10 = 855638016;
        }
        paint.setColor(i10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f131920a.isEmpty()) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i10 = this.f131927h;
        int i11 = (height - i10) / 2;
        int i12 = i10 + i11;
        int size = this.f131920a.size();
        if (size == 0) {
            return;
        }
        int i13 = (width - ((size - 1) * this.f131928i)) / size;
        int i14 = 0;
        for (String str : this.f131922c) {
            Integer num = this.f131920a.get(str);
            Integer num2 = this.f131921b.get(str);
            if (num != null && num2 != null && num.intValue() > 0) {
                int i15 = (this.f131928i + i13) * i14;
                int i16 = 0;
                while (i16 < num.intValue()) {
                    int iIntValue = i13 / num.intValue();
                    int i17 = (i16 * iIntValue) + i15;
                    canvas.drawRect(i17, i11, i16 == num.intValue() + (-1) ? i15 + i13 : iIntValue + i17, i12, i16 < num2.intValue() ? this.f131925f : this.f131926g);
                    i16++;
                }
                i14++;
            }
        }
    }

    public final void setStyleType$2563266(int i10) {
        this.f131924e = i10;
        a();
        invalidate();
    }

    public final void setTotalNum(Map<String, Integer> map) {
        this.f131920a.clear();
        this.f131921b.clear();
        this.f131922c.clear();
        this.f131923d = null;
        if (map != null) {
            this.f131920a.putAll(map);
            this.f131922c.addAll(map.keySet());
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                this.f131921b.put(it.next(), 0);
            }
        }
    }

    private c(Context context, byte b10) {
        this(context, (char) 0);
    }

    private c(Context context, char c10) {
        super(context, null, 0);
        this.f131920a = new HashMap();
        this.f131921b = new HashMap();
        this.f131922c = new ArrayList();
        this.f131923d = null;
        this.f131924e = 1;
        this.f131927h = sg.bigo.ads.common.utils.e.a(context, 2);
        this.f131928i = sg.bigo.ads.common.utils.e.a(context, 8);
        this.f131925f = new Paint(1);
        this.f131926g = new Paint(1);
        a();
    }
}
