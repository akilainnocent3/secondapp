package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import dr.w2;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,97:1\n65#1:98\n77#1,4:99\n93#1,3:103\n65#1,16:106\n93#1,3:122\n65#1,16:125\n93#1,3:141\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n35#1:98\n35#1:99,4\n35#1:103,3\n49#1:106,16\n49#1:122,3\n58#1:125,16\n58#1:141,3\n*E\n"})
public final class r {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n*L\n1#1,97:1\n*E\n"})
    public static final class c extends o0 implements ds.l<Editable, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f9379g = new c();

        public c() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@oy.m Editable editable) {
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Editable editable) {
            invoke2(editable);
            return w2.f79517a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n*L\n1#1,97:1\n*E\n"})
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l<Editable, w2> f9380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ds.r<CharSequence, Integer, Integer, Integer, w2> f9381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ds.r<CharSequence, Integer, Integer, Integer, w2> f9382d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(ds.l<? super Editable, w2> lVar, ds.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, w2> rVar, ds.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, w2> rVar2) {
            this.f9380b = lVar;
            this.f9381c = rVar;
            this.f9382d = rVar2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@oy.m Editable editable) {
            this.f9380b.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
            this.f9381c.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
            this.f9382d.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    @oy.l
    public static final TextWatcher a(@oy.l TextView textView, @oy.l ds.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, w2> rVar, @oy.l ds.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, w2> rVar2, @oy.l ds.l<? super Editable, w2> lVar) {
        d dVar = new d(lVar, rVar, rVar2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, ds.r rVar, ds.r rVar2, ds.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = a.f9377g;
        }
        if ((i10 & 2) != 0) {
            rVar2 = b.f9378g;
        }
        if ((i10 & 4) != 0) {
            lVar = c.f9379g;
        }
        d dVar = new d(lVar, rVar, rVar2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    @oy.l
    public static final TextWatcher c(@oy.l TextView textView, @oy.l ds.l<? super Editable, w2> lVar) {
        e eVar = new e(lVar);
        textView.addTextChangedListener(eVar);
        return eVar;
    }

    @oy.l
    public static final TextWatcher d(@oy.l TextView textView, @oy.l ds.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, w2> rVar) {
        f fVar = new f(rVar);
        textView.addTextChangedListener(fVar);
        return fVar;
    }

    @oy.l
    public static final TextWatcher e(@oy.l TextView textView, @oy.l ds.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, w2> rVar) {
        g gVar = new g(rVar);
        textView.addTextChangedListener(gVar);
        return gVar;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n78#2:98\n77#3:99\n*E\n"})
    public static final class f implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.r f9384b;

        public f(ds.r rVar) {
            this.f9384b = rVar;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
            this.f9384b.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@oy.m Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n*L\n1#1,97:1\n78#2:98\n71#3:99\n*E\n"})
    public static final class g implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.r f9385b;

        public g(ds.r rVar) {
            this.f9385b = rVar;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
            this.f9385b.invoke(charSequence, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@oy.m Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n*L\n1#1,97:1\n*E\n"})
    public static final class a extends o0 implements ds.r<CharSequence, Integer, Integer, Integer, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f9377g = new a();

        public a() {
            super(4);
        }

        @Override // ds.r
        public /* bridge */ /* synthetic */ w2 invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return w2.f79517a;
        }

        public final void a(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n*E\n"})
    public static final class b extends o0 implements ds.r<CharSequence, Integer, Integer, Integer, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f9378g = new b();

        public b() {
            super(4);
        }

        @Override // ds.r
        public /* bridge */ /* synthetic */ w2 invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return w2.f79517a;
        }

        public final void a(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n71#2:98\n77#3:99\n*E\n"})
    public static final class e implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l f9383b;

        public e(ds.l lVar) {
            this.f9383b = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@oy.m Editable editable) {
            this.f9383b.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@oy.m CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
