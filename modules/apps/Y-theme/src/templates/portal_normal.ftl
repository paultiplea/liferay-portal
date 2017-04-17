<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${the_title} - ${company_name}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />
<header>
  <div class="title">
    <h1>Yosemite Co.</h1>
    <p>Explore The World's Most Iconic
    Locations With Confidence And Comfort</p>
  </div>
</header>

		<#if !is_signed_in>
			<a data-redirect="${is_login_redirect_required?string}" href="${sign_in_url}" id="sign-in" rel="nofollow">${sign_in_text}</a>
		</#if>

		<!--<#if has_navigation && is_setup_complete>
			<#include "${full_templates_path}/navigation.ftl" />
		</#if>-->
	</header>
	<div class="topnav">
	<ul>
  <li style="float:right"> <a href="localhost:8080">Contact</a></li>
  <li style="float:right"> <a href="localhost:8080">About</a></li>
  <li style="float:right"> <a href="localhost:8080">Apparel</a></li>
  <li style="float:right"> <a href="localhost:8080">Home</a></li>
</ul>
</div>
	<div class="banner-image"> </div>
	<div class="banner-image-two"> </div>
	


	<section id="content">
		<h1 class="hide-accessible">${the_title}</h1>

		<!--<nav id="breadcrumbs">
			<@liferay.breadcrumbs />
		</nav>-->

		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>


<div class="center">
<div class="not-center">
	<h1 style="line-height: 1500px"> Hike </h1>
</div>
	<p> Experience Yosemite like never before on one of the
	many hiking trails 
	found throughout the park. </p>
	</div>
<div class="nose">
<h1> Fish </h1>
	<footer id="footer" role="contentinfo">
		<p class="powered-by">
			<@liferay.language key="powered-by" /> <a href="http://www.liferay.com" rel="external">Liferay</a>
		</p>
	</footer>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

<!-- inject:js -->
<!-- endinject -->

</body>

</html>