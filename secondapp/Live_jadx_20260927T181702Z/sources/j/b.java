package j;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import dr.g1;
import dr.o0;
import dr.v1;
import dr.z0;
import fr.a0;
import fr.h0;
import fr.m1;
import fr.n1;
import fr.r0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k.t0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import ms.u;
import x4.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends j.a<Uri, Boolean> {
        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l Uri input) {
            m0.p(context, "context");
            m0.p(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            m0.o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<Boolean> b(@oy.l Context context, @oy.l Uri input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i10, @oy.m Intent intent) {
            return Boolean.valueOf(i10 == -1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class c extends j.a<String, Uri> {
        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l String input) {
            m0.p(context, "context");
            m0.p(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            m0.o(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<Uri> b(@oy.l Context context, @oy.l String input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @oy.m Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends j.a<String, List<Uri>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f99191a = new a(null);

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(x xVar) {
                this();
            }

            @oy.l
            public final List<Uri> a(@oy.l Intent intent) {
                m0.p(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return h0.J();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i10 = 0; i10 < itemCount; i10++) {
                        Uri uri = clipData.getItemAt(i10).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public a() {
            }
        }

        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l String input) {
            m0.p(context, "context");
            m0.p(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            m0.o(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<List<Uri>> b(@oy.l Context context, @oy.l String input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i10, @oy.m Intent intent) {
            List<Uri> listA;
            if (i10 != -1) {
                intent = null;
            }
            return (intent == null || (listA = f99191a.a(intent)) == null) ? h0.J() : listA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class e extends j.a<String[], Uri> {
        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l String[] input) {
            m0.p(context, "context");
            m0.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            m0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<Uri> b(@oy.l Context context, @oy.l String[] input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @oy.m Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class f extends j.a<Uri, Uri> {
        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.m Uri uri) {
            m0.p(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<Uri> b(@oy.l Context context, @oy.m Uri uri) {
            m0.p(context, "context");
            return null;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @oy.m Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g extends j.a<String[], List<Uri>> {
        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l String[] input) {
            m0.p(context, "context");
            m0.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            m0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<List<Uri>> b(@oy.l Context context, @oy.l String[] input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i10, @oy.m Intent intent) {
            List<Uri> listA;
            if (i10 != -1) {
                intent = null;
            }
            return (intent == null || (listA = d.f99191a.a(intent)) == null) ? h0.J() : listA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static final class h extends j.a<Void, Uri> {
        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.m Void r10) {
            m0.p(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            m0.o(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri c(int i10, @oy.m Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends j.a<i.m, List<Uri>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final a f99192b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99193a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(x xVar) {
                this();
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int a() {
                if (j.f99194a.j()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }

            public a() {
            }
        }

        public i() {
            this(0, 1, null);
        }

        @Override // j.a
        @oy.l
        @k.i
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l i.m input) {
            m0.p(context, "context");
            m0.p(input, "input");
            j.a aVar = j.f99194a;
            if (aVar.j()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.e(input.a()));
                if (this.f99193a > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f99193a);
                return intent;
            }
            if (aVar.i(context)) {
                ResolveInfo resolveInfoD = aVar.d(context);
                if (resolveInfoD == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = resolveInfoD.activityInfo;
                Intent intent2 = new Intent(j.f99195b);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(aVar.e(input.a()));
                intent2.putExtra(j.f99196c, this.f99193a);
                return intent2;
            }
            if (!aVar.f(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.e(input.a()));
                intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent3.getType() == null) {
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent3;
            }
            ResolveInfo resolveInfoC = aVar.c(context);
            if (resolveInfoC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoC.activityInfo;
            Intent intent4 = new Intent(j.f99197d);
            intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent4.putExtra(j.f99198e, this.f99193a);
            return intent4;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<List<Uri>> b(@oy.l Context context, @oy.l i.m input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i10, @oy.m Intent intent) {
            List<Uri> listA;
            if (i10 != -1) {
                intent = null;
            }
            return (intent == null || (listA = d.f99191a.a(intent)) == null) ? h0.J() : listA;
        }

        public /* synthetic */ i(int i10, int i11, x xVar) {
            this((i11 & 1) != 0 ? f99192b.a() : i10);
        }

        public i(int i10) {
            this.f99193a = i10;
            if (i10 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class j extends j.a<i.m, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f99194a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f99195b = "androidx.activity.result.contract.action.PICK_IMAGES";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final String f99196c = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public static final String f99197d = "com.google.android.gms.provider.action.PICK_IMAGES";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.l
        public static final String f99198e = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(x xVar) {
                this();
            }

            @cs.o
            @oy.m
            public final ResolveInfo c(@oy.l Context context) {
                m0.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.f99197d), v0.f144464d);
            }

            @cs.o
            @oy.m
            public final ResolveInfo d(@oy.l Context context) {
                m0.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(j.f99195b), v0.f144464d);
            }

            @oy.m
            public final String e(@oy.l f input) {
                m0.p(input, "input");
                if (input instanceof c) {
                    return "image/*";
                }
                if (input instanceof e) {
                    return "video/*";
                }
                if (input instanceof d) {
                    return ((d) input).a();
                }
                if (input instanceof C0929b) {
                    return null;
                }
                throw new o0();
            }

            @cs.o
            public final boolean f(@oy.l Context context) {
                m0.p(context, "context");
                return c(context) != null;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            @cs.o
            @dr.o(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @g1(expression = "isPhotoPickerAvailable(context)", imports = {}))
            public final boolean g() {
                return j();
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            @cs.o
            public final boolean h(@oy.l Context context) {
                m0.p(context, "context");
                return j() || i(context) || f(context);
            }

            @cs.o
            public final boolean i(@oy.l Context context) {
                m0.p(context, "context");
                return d(context) != null;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            @cs.o
            public final boolean j() {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    return true;
                }
                return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            public a() {
            }

            public static /* synthetic */ void a() {
            }

            public static /* synthetic */ void b() {
            }
        }

        /* JADX INFO: renamed from: j.b$j$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0929b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final C0929b f99199a = new C0929b();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final c f99200a = new c();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class d implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public final String f99201a;

            public d(@oy.l String mimeType) {
                m0.p(mimeType, "mimeType");
                this.f99201a = mimeType;
            }

            @oy.l
            public final String a() {
                return this.f99201a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class e implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @oy.l
            public static final e f99202a = new e();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface f {
        }

        @cs.o
        @oy.m
        public static final ResolveInfo e(@oy.l Context context) {
            return f99194a.c(context);
        }

        @cs.o
        @oy.m
        public static final ResolveInfo g(@oy.l Context context) {
            return f99194a.d(context);
        }

        @cs.o
        public static final boolean h(@oy.l Context context) {
            return f99194a.f(context);
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        @cs.o
        @dr.o(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @g1(expression = "isPhotoPickerAvailable(context)", imports = {}))
        public static final boolean i() {
            return f99194a.g();
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        @cs.o
        public static final boolean j(@oy.l Context context) {
            return f99194a.h(context);
        }

        @cs.o
        public static final boolean k(@oy.l Context context) {
            return f99194a.i(context);
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        @cs.o
        public static final boolean l() {
            return f99194a.j();
        }

        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l i.m input) {
            m0.p(context, "context");
            m0.p(input, "input");
            a aVar = f99194a;
            if (aVar.j()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.e(input.a()));
                return intent;
            }
            if (aVar.i(context)) {
                ResolveInfo resolveInfoD = aVar.d(context);
                if (resolveInfoD == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = resolveInfoD.activityInfo;
                Intent intent2 = new Intent(f99195b);
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(aVar.e(input.a()));
                return intent2;
            }
            if (!aVar.f(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.e(input.a()));
                if (intent3.getType() == null) {
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent3;
            }
            ResolveInfo resolveInfoC = aVar.c(context);
            if (resolveInfoC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = resolveInfoC.activityInfo;
            Intent intent4 = new Intent(f99197d);
            intent4.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent4.setType(aVar.e(input.a()));
            return intent4;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<Uri> b(@oy.l Context context, @oy.l i.m input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @oy.m Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            return data == null ? (Uri) r0.L2(d.f99191a.a(intent)) : data;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,953:1\n12541#2,2:954\n8676#2,2:956\n9358#2,4:958\n11365#2:962\n11700#2,3:963\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n189#1:954,2\n196#1:956,2\n196#1:958,4\n209#1:962\n209#1:963,3\n*E\n"})
    public static final class k extends j.a<String[], Map<String, Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f99203a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f99204b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final String f99205c = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public static final String f99206d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(x xVar) {
                this();
            }

            @oy.l
            public final Intent a(@oy.l String[] input) {
                m0.p(input, "input");
                Intent intentPutExtra = new Intent(k.f99204b).putExtra(k.f99205c, input);
                m0.o(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            }

            public a() {
            }
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l String[] input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return f99203a.a(input);
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public j.a.C0927a<Map<String, Boolean>> b(@oy.l Context context, @oy.l String[] input) {
            m0.p(context, "context");
            m0.p(input, "input");
            if (input.length == 0) {
                return new j.a.C0927a<>(n1.z());
            }
            for (String str : input) {
                if (f1.d.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(m1.j(input.length), 16));
            for (String str2 : input) {
                z0 z0VarA = v1.a(str2, Boolean.TRUE);
                linkedHashMap.put(z0VarA.j(), z0VarA.k());
            }
            return new j.a.C0927a<>(linkedHashMap);
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> c(int i10, @oy.m Intent intent) {
            if (i10 != -1) {
                return n1.z();
            }
            if (intent == null) {
                return n1.z();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(f99205c);
            int[] intArrayExtra = intent.getIntArrayExtra(f99206d);
            if (intArrayExtra == null || stringArrayExtra == null) {
                return n1.z();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i11 == 0));
            }
            return n1.B0(r0.o6(a0.cb(stringArrayExtra), arrayList));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,953:1\n12774#2,2:954\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n229#1:954,2\n*E\n"})
    public static final class l extends j.a<String, Boolean> {
        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l String input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return k.f99203a.a(new String[]{input});
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public j.a.C0927a<Boolean> b(@oy.l Context context, @oy.l String input) {
            m0.p(context, "context");
            m0.p(input, "input");
            if (f1.d.checkSelfPermission(context, input) == 0) {
                return new j.a.C0927a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean c(int i10, @oy.m Intent intent) {
            if (intent == null || i10 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(k.f99206d);
            boolean z10 = false;
            if (intArrayExtra != null) {
                for (int i11 : intArrayExtra) {
                    if (i11 == 0) {
                        z10 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class m extends j.a<Intent, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f99207a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f99208b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(x xVar) {
                this();
            }

            public a() {
            }
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l Intent input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return input;
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i10, @oy.m Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class n extends j.a<IntentSenderRequest, ActivityResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f99209a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f99210b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final String f99211c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public static final String f99212d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public /* synthetic */ a(x xVar) {
                this();
            }

            public a() {
            }
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l IntentSenderRequest input) {
            m0.p(context, "context");
            m0.p(input, "input");
            Intent intentPutExtra = new Intent(f99210b).putExtra(f99211c, input);
            m0.o(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i10, @oy.m Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class o extends j.a<Uri, Boolean> {
        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l Uri input) {
            m0.p(context, "context");
            m0.p(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            m0.o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<Boolean> b(@oy.l Context context, @oy.l Uri input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i10, @oy.m Intent intent) {
            return Boolean.valueOf(i10 == -1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class p extends j.a<Void, Bitmap> {
        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.m Void r10) {
            m0.p(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<Bitmap> b(@oy.l Context context, @oy.m Void r10) {
            m0.p(context, "context");
            return null;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i10, @oy.m Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    @dr.o(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    public static class q extends j.a<Uri, Bitmap> {
        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l Uri input) {
            m0.p(context, "context");
            m0.p(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            m0.o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<Bitmap> b(@oy.l Context context, @oy.l Uri input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i10, @oy.m Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: j.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class C0928b extends j.a<String, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public final String f99190a;

        public C0928b(@oy.l String mimeType) {
            m0.p(mimeType, "mimeType");
            this.f99190a = mimeType;
        }

        @Override // j.a
        @oy.l
        @k.i
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@oy.l Context context, @oy.l String input) {
            m0.p(context, "context");
            m0.p(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f99190a).putExtra("android.intent.extra.TITLE", input);
            m0.o(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final j.a.C0927a<Uri> b(@oy.l Context context, @oy.l String input) {
            m0.p(context, "context");
            m0.p(input, "input");
            return null;
        }

        @Override // j.a
        @oy.m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int i10, @oy.m Intent intent) {
            if (i10 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @dr.o(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @g1(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C0928b() {
            this("*/*");
        }
    }
}
