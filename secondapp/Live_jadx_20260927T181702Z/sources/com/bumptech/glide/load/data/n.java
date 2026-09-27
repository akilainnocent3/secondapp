package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n extends l<InputStream> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f31460f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31461g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f31462h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f31463i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f31464j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final UriMatcher f31465k;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f31465k = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public InputStream e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamH = h(uri, contentResolver);
        if (inputStreamH != null) {
            return inputStreamH;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    public final InputStream h(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f31465k.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return i(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return i(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    public final InputStream i(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
