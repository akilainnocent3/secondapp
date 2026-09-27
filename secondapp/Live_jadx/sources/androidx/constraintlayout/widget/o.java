package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f8917f = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f8918g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8919a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8920b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8921c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray<a> f8922d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f8923e = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<b> f8925b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8927d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f8926c = -1;
            this.f8927d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), l.c.f8874xe);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == l.c.f8891ye) {
                    this.f8924a = typedArrayObtainStyledAttributes.getResourceId(index, this.f8924a);
                } else if (index == l.c.f8908ze) {
                    this.f8926c = typedArrayObtainStyledAttributes.getResourceId(index, this.f8926c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8926c);
                    context.getResources().getResourceName(this.f8926c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8927d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f8925b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f8925b.size(); i10++) {
                if (this.f8925b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f8931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f8934g;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f8929b = Float.NaN;
            this.f8930c = Float.NaN;
            this.f8931d = Float.NaN;
            this.f8932e = Float.NaN;
            this.f8933f = -1;
            this.f8934g = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), l.c.f8773rf);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == l.c.f8790sf) {
                    this.f8933f = typedArrayObtainStyledAttributes.getResourceId(index, this.f8933f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8933f);
                    context.getResources().getResourceName(this.f8933f);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8934g = true;
                    }
                } else if (index == l.c.f8807tf) {
                    this.f8932e = typedArrayObtainStyledAttributes.getDimension(index, this.f8932e);
                } else if (index == l.c.f8824uf) {
                    this.f8930c = typedArrayObtainStyledAttributes.getDimension(index, this.f8930c);
                } else if (index == l.c.f8841vf) {
                    this.f8931d = typedArrayObtainStyledAttributes.getDimension(index, this.f8931d);
                } else if (index == l.c.f8858wf) {
                    this.f8929b = typedArrayObtainStyledAttributes.getDimension(index, this.f8929b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f8929b) && f10 < this.f8929b) {
                return false;
            }
            if (!Float.isNaN(this.f8930c) && f11 < this.f8930c) {
                return false;
            }
            if (Float.isNaN(this.f8931d) || f10 <= this.f8931d) {
                return Float.isNaN(this.f8932e) || f11 <= this.f8932e;
            }
            return false;
        }
    }

    public o(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    public int a(int i10, int i11, float f10, float f11) {
        a aVar = this.f8922d.get(i11);
        if (aVar == null) {
            return i11;
        }
        if (f10 != -1.0f && f11 != -1.0f) {
            b bVar = null;
            for (b bVar2 : aVar.f8925b) {
                if (bVar2.a(f10, f11)) {
                    if (i10 != bVar2.f8933f) {
                        bVar = bVar2;
                    }
                }
            }
            return bVar != null ? bVar.f8933f : aVar.f8926c;
        }
        if (aVar.f8926c != i10) {
            Iterator<b> it = aVar.f8925b.iterator();
            while (it.hasNext()) {
                if (i10 == it.next().f8933f) {
                }
            }
            return aVar.f8926c;
        }
        return i10;
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), l.c.Ae);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == l.c.Be) {
                this.f8919a = typedArrayObtainStyledAttributes.getResourceId(index, this.f8919a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xmlPullParser);
                                this.f8922d.put(aVar.f8924a, aVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals(androidx.constraintlayout.motion.widget.b.K);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xmlPullParser);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && androidx.constraintlayout.motion.widget.b.K.equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e11);
        }
    }

    public boolean c(int i10, float f10, float f11) {
        int i11 = this.f8920b;
        if (i11 != i10) {
            return true;
        }
        a aVarValueAt = i10 == -1 ? this.f8922d.valueAt(0) : this.f8922d.get(i11);
        int i12 = this.f8921c;
        return (i12 == -1 || !aVarValueAt.f8925b.get(i12).a(f10, f11)) && this.f8921c != aVarValueAt.b(f10, f11);
    }

    public void d(i iVar) {
        this.f8923e = iVar;
    }

    public int e(int i10, int i11, int i12) {
        return f(-1, i10, i11, i12);
    }

    public int f(int i10, int i11, float f10, float f11) {
        int iB;
        if (i10 != i11) {
            a aVar = this.f8922d.get(i11);
            if (aVar == null) {
                return -1;
            }
            int iB2 = aVar.b(f10, f11);
            return iB2 == -1 ? aVar.f8926c : aVar.f8925b.get(iB2).f8933f;
        }
        a aVarValueAt = i11 == -1 ? this.f8922d.valueAt(0) : this.f8922d.get(this.f8920b);
        if (aVarValueAt == null) {
            return -1;
        }
        if ((this.f8921c == -1 || !aVarValueAt.f8925b.get(i10).a(f10, f11)) && i10 != (iB = aVarValueAt.b(f10, f11))) {
            return iB == -1 ? aVarValueAt.f8926c : aVarValueAt.f8925b.get(iB).f8933f;
        }
        return i10;
    }
}
