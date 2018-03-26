# Custom Password TextInputLayout
This is a custom TextInputLayout modified to show Password strength. Password strength is evaluated based on below conditions such as
 * Should have at least one Uppercase or a Lowercase character
 * Should have at least one Numerical character
 * Should have at least one Special character/ Symbol
 * Should be minimum of 8 characters altogether.

# Supports both LTR and RTL layouts
## LTR

![LTR](https://github.com/akshayjkumar/CustomPasswordTextInputLayout/blob/master/password_english_layout.gif?raw=true)

## RTL

![RTL](https://github.com/akshayjkumar/CustomPasswordTextInputLayout/blob/master/password_arabic_layout.gif?raw=true)

# Usage
Use the view in the layout file just like a normal material design component TextInputLayout. Supports all attributes
currently supported by the TextInputLayout as LTRTLPasswordTIL is based on TextInputLayout.

    <ajdev.com.LTRTLPasswordTIL
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layoutDirection="locale"
        android:textDirection="locale"
        android:textAlignment="viewStart"
        app:errorTextAppearance="@style/AppTheme.TextErrorAppearance"
        app:passwordToggleEnabled="true">

        <android.support.design.widget.TextInputEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/password_hint"
            android:inputType="textPassword"
            android:layoutDirection="locale"
            android:textDirection="locale"            
            android:textAlignment="viewStart"            
            android:maxLines="1" />

    </ajdev.com.LTRTLPasswordTIL>

# APIs
## setLegend(boolean)
Legend helps to determine the position of the default error view when the password strength is shown. Default value of legend is false which positions the error view towards the start of the layout. In this configuration, password strength will be positioned towards the end of the layout. Value of the legend is considered only if the associated error property of this layout is enabled.


`LTRTLPasswordTIL passwordTIL = (LTRTLPasswordTIL) findViewById(R.id.passwordTIL);`

`passwordTIL.setErrorEnabled(true);`

`passwordTIL.setErrorTextAppearance(R.style.AppTheme_TextErrorAppearance);`

`passwordTIL.setError("This is a required field");`

`passwordTIL.setLegend(true);`

# Dependency:
com.android.support:design
