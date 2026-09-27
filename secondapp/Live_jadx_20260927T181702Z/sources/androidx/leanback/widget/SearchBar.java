package androidx.leanback.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends RelativeLayout {
    public static final String C = "SearchBar";
    public static final boolean D = false;
    public static final float E = 1.0f;
    public static final float F = 1.0f;
    public static final int G = 1;
    public static final int H = 0;
    public static final float I = 1.0f;
    public final Context A;
    public l B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f12168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SearchEditText f12169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpeechOrbView f12170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f12171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f12173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f12174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f12175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f12176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InputMethodManager f12177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f12179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f12180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f12183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SpeechRecognizer f12187u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v2 f12188v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SoundPool f12190x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SparseIntArray f12191y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12192z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f12193b;

        public a(int i10) {
            this.f12193b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar.this.f12190x.play(SearchBar.this.f12191y.get(this.f12193b), 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                SearchBar.this.k();
            } else {
                SearchBar.this.c();
            }
            SearchBar.this.q(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar searchBar = SearchBar.this;
            searchBar.setSearchQueryInternal(searchBar.f12169c.getText().toString());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements SearchEditText.b {
        public e() {
        }

        @Override // androidx.leanback.widget.SearchEditText.b
        public void a() {
            SearchBar searchBar = SearchBar.this;
            k kVar = searchBar.f12168b;
            if (kVar != null) {
                kVar.c(searchBar.f12172f);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements TextView.OnEditorActionListener {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar.this.n();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f12168b.c(searchBar.f12172f);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f12178l = true;
                searchBar.f12170d.requestFocus();
            }
        }

        public f() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (3 == i10 || i10 == 0) {
                SearchBar searchBar = SearchBar.this;
                if (searchBar.f12168b != null) {
                    searchBar.c();
                    SearchBar.this.f12176j.postDelayed(new a(), 500L);
                    return true;
                }
            }
            if (1 == i10) {
                SearchBar searchBar2 = SearchBar.this;
                if (searchBar2.f12168b != null) {
                    searchBar2.c();
                    SearchBar.this.f12176j.postDelayed(new b(), 500L);
                    return true;
                }
            }
            if (2 != i10) {
                return false;
            }
            SearchBar.this.c();
            SearchBar.this.f12176j.postDelayed(new c(), 500L);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchBar.this.o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class h implements View.OnFocusChangeListener {
        public h() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            if (z10) {
                SearchBar.this.c();
                SearchBar searchBar = SearchBar.this;
                if (searchBar.f12178l) {
                    searchBar.l();
                    SearchBar.this.f12178l = false;
                }
            } else {
                SearchBar.this.m();
            }
            SearchBar.this.q(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar.this.f12169c.requestFocusFromTouch();
            SearchBar.this.f12169c.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, SearchBar.this.f12169c.getWidth(), SearchBar.this.f12169c.getHeight(), 0));
            SearchBar.this.f12169c.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, SearchBar.this.f12169c.getWidth(), SearchBar.this.f12169c.getHeight(), 0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface k {
        void a(String str);

        void b(String str);

        void c(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface l {
        void a();
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    public void a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new CompletionInfo(arrayList.size(), arrayList.size(), it.next()));
            }
        }
        b((CompletionInfo[]) arrayList.toArray(new CompletionInfo[arrayList.size()]));
    }

    public void b(CompletionInfo[] completionInfoArr) {
        this.f12177k.displayCompletions(this.f12169c, completionInfoArr);
    }

    public void c() {
        this.f12177k.hideSoftInputFromWindow(this.f12169c.getWindowToken(), 0);
    }

    public boolean d() {
        return this.f12192z;
    }

    public final boolean e() {
        return this.f12170d.isFocused();
    }

    public final void f(Context context) {
        int[] iArr = {s3.a.k.f128852a, s3.a.k.f128854c, s3.a.k.f128853b, s3.a.k.f128855d};
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = iArr[i10];
            this.f12191y.put(i11, this.f12190x.load(context, i11, 1));
        }
    }

    public final void g(int i10) {
        this.f12176j.post(new a(i10));
    }

    public Drawable getBadgeDrawable() {
        return this.f12175i;
    }

    public CharSequence getHint() {
        return this.f12173g;
    }

    public String getTitle() {
        return this.f12174h;
    }

    public void h() {
        g(s3.a.k.f128852a);
    }

    public void i() {
        g(s3.a.k.f128854c);
    }

    public void j() {
        g(s3.a.k.f128855d);
    }

    public void k() {
        this.f12176j.post(new i());
    }

    public void l() {
        if (this.f12192z) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.f12188v != null) {
            this.f12169c.setText("");
            this.f12169c.setHint("");
            this.f12188v.a();
            this.f12192z = true;
            return;
        }
        if (this.f12187u == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            l lVar = this.B;
            if (lVar == null) {
                throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
            }
            lVar.a();
            return;
        }
        this.f12192z = true;
        this.f12169c.setText("");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.f12187u.setRecognitionListener(new j());
        this.f12189w = true;
        this.f12187u.startListening(intent);
    }

    public void m() {
        if (this.f12192z) {
            this.f12169c.setText(this.f12172f);
            this.f12169c.setHint(this.f12173g);
            this.f12192z = false;
            if (this.f12188v != null || this.f12187u == null) {
                return;
            }
            this.f12170d.j();
            if (this.f12189w) {
                this.f12187u.cancel();
                this.f12189w = false;
            }
            this.f12187u.setRecognitionListener(null);
        }
    }

    public void n() {
        k kVar;
        if (TextUtils.isEmpty(this.f12172f) || (kVar = this.f12168b) == null) {
            return;
        }
        kVar.a(this.f12172f);
    }

    public void o() {
        if (this.f12192z) {
            m();
        } else {
            l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12190x = new SoundPool(2, 1, 0);
        f(this.A);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m();
        this.f12190x.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12179m = ((RelativeLayout) findViewById(s3.a.h.f128749o1)).getBackground();
        this.f12169c = (SearchEditText) findViewById(s3.a.h.f128761r1);
        ImageView imageView = (ImageView) findViewById(s3.a.h.f128745n1);
        this.f12171e = imageView;
        Drawable drawable = this.f12175i;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f12169c.setOnFocusChangeListener(new b());
        this.f12169c.addTextChangedListener(new d(new c()));
        this.f12169c.setOnKeyboardDismissListener(new e());
        this.f12169c.setOnEditorActionListener(new f());
        this.f12169c.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(s3.a.h.f128753p1);
        this.f12170d = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new g());
        this.f12170d.setOnFocusChangeListener(new h());
        q(hasFocus());
        p();
    }

    public final void p() {
        String string = getResources().getString(s3.a.l.I);
        if (!TextUtils.isEmpty(this.f12174h)) {
            string = e() ? getResources().getString(s3.a.l.L, this.f12174h) : getResources().getString(s3.a.l.K, this.f12174h);
        } else if (e()) {
            string = getResources().getString(s3.a.l.J);
        }
        this.f12173g = string;
        SearchEditText searchEditText = this.f12169c;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public void q(boolean z10) {
        if (z10) {
            this.f12179m.setAlpha(this.f12185s);
            if (e()) {
                this.f12169c.setTextColor(this.f12183q);
                this.f12169c.setHintTextColor(this.f12183q);
            } else {
                this.f12169c.setTextColor(this.f12181o);
                this.f12169c.setHintTextColor(this.f12183q);
            }
        } else {
            this.f12179m.setAlpha(this.f12184r);
            this.f12169c.setTextColor(this.f12180n);
            this.f12169c.setHintTextColor(this.f12182p);
        }
        p();
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.f12175i = drawable;
        ImageView imageView = this.f12171e;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            if (drawable != null) {
                this.f12171e.setVisibility(0);
            } else {
                this.f12171e.setVisibility(8);
            }
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i10) {
        this.f12170d.setNextFocusDownId(i10);
        this.f12169c.setNextFocusDownId(i10);
    }

    public void setPermissionListener(l lVar) {
        this.B = lVar;
    }

    public void setSearchAffordanceColors(SearchOrbView.a aVar) {
        SpeechOrbView speechOrbView = this.f12170d;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(aVar);
        }
    }

    public void setSearchAffordanceColorsInListening(SearchOrbView.a aVar) {
        SpeechOrbView speechOrbView = this.f12170d;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(aVar);
        }
    }

    public void setSearchBarListener(k kVar) {
        this.f12168b = kVar;
    }

    public void setSearchQuery(String str) {
        m();
        this.f12169c.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.f12172f, str)) {
            return;
        }
        this.f12172f = str;
        k kVar = this.f12168b;
        if (kVar != null) {
            kVar.b(str);
        }
    }

    @Deprecated
    public void setSpeechRecognitionCallback(v2 v2Var) {
        this.f12188v = v2Var;
        if (v2Var != null && this.f12187u != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        m();
        SpeechRecognizer speechRecognizer2 = this.f12187u;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.f12189w) {
                this.f12187u.cancel();
                this.f12189w = false;
            }
        }
        this.f12187u = speechRecognizer;
        if (this.f12188v != null && speechRecognizer != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setTitle(String str) {
        this.f12174h = str;
        p();
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12176j = new Handler();
        this.f12178l = false;
        this.f12191y = new SparseIntArray();
        this.f12192z = false;
        this.A = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(s3.a.j.Y, (ViewGroup) this, true);
        this.f12186t = getResources().getDimensionPixelSize(s3.a.e.f128544d3);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f12186t);
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f12172f = "";
        this.f12177k = (InputMethodManager) context.getSystemService("input_method");
        this.f12181o = resources.getColor(s3.a.d.S);
        this.f12180n = resources.getColor(s3.a.d.R);
        this.f12185s = resources.getInteger(s3.a.i.D);
        this.f12184r = resources.getInteger(s3.a.i.E);
        this.f12183q = resources.getColor(s3.a.d.Q);
        this.f12182p = resources.getColor(s3.a.d.P);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f12197b;

        public d(Runnable runnable) {
            this.f12197b = runnable;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchBar searchBar = SearchBar.this;
            if (searchBar.f12192z) {
                return;
            }
            searchBar.f12176j.removeCallbacks(this.f12197b);
            SearchBar.this.f12176j.post(this.f12197b);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class j implements RecognitionListener {
        public j() {
        }

        @Override // android.speech.RecognitionListener
        public void onError(int i10) {
            switch (i10) {
                case 1:
                    Log.w(SearchBar.C, "recognizer network timeout");
                    break;
                case 2:
                    Log.w(SearchBar.C, "recognizer network error");
                    break;
                case 3:
                    Log.w(SearchBar.C, "recognizer audio error");
                    break;
                case 4:
                    Log.w(SearchBar.C, "recognizer server error");
                    break;
                case 5:
                    Log.w(SearchBar.C, "recognizer client error");
                    break;
                case 6:
                    Log.w(SearchBar.C, "recognizer speech timeout");
                    break;
                case 7:
                    Log.w(SearchBar.C, "recognizer no match");
                    break;
                case 8:
                    Log.w(SearchBar.C, "recognizer busy");
                    break;
                case 9:
                    Log.w(SearchBar.C, "recognizer insufficient permissions");
                    break;
                default:
                    Log.d(SearchBar.C, "recognizer other error");
                    break;
            }
            SearchBar.this.m();
            SearchBar.this.h();
        }

        @Override // android.speech.RecognitionListener
        public void onPartialResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList == null || stringArrayList.size() == 0) {
                return;
            }
            SearchBar.this.f12169c.h(stringArrayList.get(0), stringArrayList.size() > 1 ? stringArrayList.get(1) : null);
        }

        @Override // android.speech.RecognitionListener
        public void onReadyForSpeech(Bundle bundle) {
            SearchBar.this.f12170d.i();
            SearchBar.this.i();
        }

        @Override // android.speech.RecognitionListener
        public void onResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null) {
                SearchBar.this.f12172f = stringArrayList.get(0);
                SearchBar searchBar = SearchBar.this;
                searchBar.f12169c.setText(searchBar.f12172f);
                SearchBar.this.n();
            }
            SearchBar.this.m();
            SearchBar.this.j();
        }

        @Override // android.speech.RecognitionListener
        public void onRmsChanged(float f10) {
            SearchBar.this.f12170d.setSoundLevel(f10 < 0.0f ? 0 : (int) (f10 * 10.0f));
        }

        @Override // android.speech.RecognitionListener
        public void onBeginningOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onBufferReceived(byte[] bArr) {
        }

        @Override // android.speech.RecognitionListener
        public void onEndOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onEvent(int i10, Bundle bundle) {
        }
    }
}
